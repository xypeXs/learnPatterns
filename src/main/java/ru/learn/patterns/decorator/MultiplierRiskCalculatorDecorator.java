package ru.learn.patterns.decorator;

import java.math.BigDecimal;

public class MultiplierRiskCalculatorDecorator extends AbstractRiskCalculatorDecorator {
    private final BigDecimal multiplier;

    public MultiplierRiskCalculatorDecorator(AbstractRiskCalculator riskCalculator, String sysName, BigDecimal multiplier) {
        super(riskCalculator, sysName);
        this.multiplier = multiplier;
    }


    @Override
    public RiskDto getRisk() {
        RiskDto baseRiskDto = multiply(RiskDao.getRiskBySysName(sysName));
        if (riskCalculator == null)
            return baseRiskDto;

        RiskDto superRiskDto = riskCalculator.getRisk();
        return RiskDto.merge(baseRiskDto, superRiskDto);
    }

    private RiskDto multiply(RiskDto riskDto) {
        return new RiskDto(riskDto.getPremium().multiply(multiplier), riskDto.getAmount().multiply(multiplier));
    }
}
