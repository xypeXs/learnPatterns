package ru.learn.patterns.decorator;

public class BaseRiskCalculatorDecorator extends AbstractRiskCalculatorDecorator {

    public BaseRiskCalculatorDecorator(AbstractRiskCalculator riskCalculator, String sysName) {
        super(riskCalculator, sysName);
    }

    @Override
    public RiskDto getRisk() {
        RiskDto baseRiskDto = RiskDao.getRiskBySysName(sysName);
        if (riskCalculator == null)
            return baseRiskDto;

        RiskDto superRiskDto = riskCalculator.getRisk();
        return RiskDto.merge(baseRiskDto, superRiskDto);
    }
}
