package ru.learn.patterns.decorator;

import java.math.BigDecimal;

public class MultiplierRiskCalculator extends AbstractRiskCalculator {
    private final BigDecimal multiplier;

    public MultiplierRiskCalculator(String sysName, BigDecimal multiplier) {
        super(sysName);
        this.multiplier = multiplier;
    }

    @Override
    public RiskDto getRisk() {
        return multiply(RiskDao.getRiskBySysName(sysName));
    }

    private RiskDto multiply(RiskDto riskDto) {
        return new RiskDto(riskDto.getPremium().multiply(multiplier), riskDto.getAmount().multiply(multiplier));
    }

}
