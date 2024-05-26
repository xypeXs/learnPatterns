package ru.learn.patterns.decorator;

public class BaseRiskCalculator extends AbstractRiskCalculator {

    protected BaseRiskCalculator(String sysName) {
        super(sysName);
    }

    @Override
    public RiskDto getRisk() {
        return RiskDao.getRiskBySysName(sysName);
    }
}
