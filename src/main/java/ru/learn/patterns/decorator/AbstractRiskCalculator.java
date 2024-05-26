package ru.learn.patterns.decorator;

public abstract class AbstractRiskCalculator {
    protected final String sysName;
    protected AbstractRiskCalculator(String sysName) {
        this.sysName = sysName;
    }
    public abstract RiskDto getRisk();
}
