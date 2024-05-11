package ru.learn.patterns.strategy.calculator;

import ru.learn.patterns.strategy.tariff.RubleTariffExtractor;

public class DefaultCalculator extends Calculator {

    public DefaultCalculator() {
        super();
        setTariffExtractor(new RubleTariffExtractor());
    }
}
