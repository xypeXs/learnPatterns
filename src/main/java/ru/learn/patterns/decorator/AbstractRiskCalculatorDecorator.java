package ru.learn.patterns.decorator;

public abstract class AbstractRiskCalculatorDecorator extends AbstractRiskCalculator {
    protected AbstractRiskCalculator riskCalculator;

    public AbstractRiskCalculatorDecorator(AbstractRiskCalculator riskCalculator, String sysName) {
        super(sysName);
        this.riskCalculator = riskCalculator;
    }
}
