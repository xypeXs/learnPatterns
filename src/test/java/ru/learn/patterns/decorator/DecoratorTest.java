package ru.learn.patterns.decorator;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.math.BigDecimal;
import java.util.List;

public class DecoratorTest extends TestCase {

    public void testBaseCalculator() {
        testBaseCalculatorByArr(Constants.DEATH_RISK);
        testBaseCalculatorByArr(Constants.DEATH_RISK, Constants.DISABILITY_RISK);
        testBaseCalculatorByArr(Constants.DEATH_RISK, Constants.DISABILITY_RISK, Constants.INJURY_RISK);
    }

    public void testMultiplierCalculator() {
        testMultiplierCalculatorByArr(List.of(Constants.DEATH_RISK), List.of(BigDecimal.valueOf(0.8)));
        testMultiplierCalculatorByArr(
                List.of(Constants.DEATH_RISK, Constants.DISABILITY_RISK),
                List.of(BigDecimal.valueOf(0.8), BigDecimal.valueOf(1.1))
        );
        testMultiplierCalculatorByArr(
                List.of(Constants.DEATH_RISK, Constants.DISABILITY_RISK, Constants.INJURY_RISK),
                List.of(BigDecimal.valueOf(1.1), BigDecimal.valueOf(1.2), BigDecimal.valueOf(0.5))
        );
    }

    private void testBaseCalculatorByArr(String... riskSysName) {
        if (riskSysName == null || riskSysName.length == 0) {
            Assert.fail();
        }

        AbstractRiskCalculator decoratedCalculator = new BaseRiskCalculator(riskSysName[0]);
        RiskDto referenceRisk = decoratedCalculator.getRisk();
        for (int i = 1; i < riskSysName.length; i++) {
            referenceRisk = RiskDto.merge(referenceRisk, (new BaseRiskCalculator(riskSysName[i])).getRisk());
            decoratedCalculator = new BaseRiskCalculatorDecorator(decoratedCalculator, riskSysName[i]);
        }
        Assert.assertEquals(referenceRisk, decoratedCalculator.getRisk());
    }

    private void testMultiplierCalculatorByArr(List<String> riskSysNameList, List<BigDecimal> multiplierList) {
        if (riskSysNameList == null || riskSysNameList.isEmpty() || multiplierList == null || multiplierList.isEmpty() ||
                multiplierList.size() != riskSysNameList.size()) {
            Assert.fail();
        }

        AbstractRiskCalculator decoratedCalculator = new MultiplierRiskCalculator(riskSysNameList.get(0), multiplierList.get(0));
        RiskDto referenceRisk = decoratedCalculator.getRisk();
        for (int i = 1; i < riskSysNameList.size(); i++) {
            referenceRisk = RiskDto.merge(referenceRisk, (new MultiplierRiskCalculator(riskSysNameList.get(i), multiplierList.get(i))).getRisk());
            decoratedCalculator = new MultiplierRiskCalculatorDecorator(decoratedCalculator, riskSysNameList.get(i), multiplierList.get(i));
        }
        Assert.assertEquals(referenceRisk, decoratedCalculator.getRisk());
    }
}
