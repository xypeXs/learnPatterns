package ru.learn.patterns.strategy.calculator;

import ru.learn.patterns.strategy.tariff.RubleTariffExtractor;

public class RussianCalculator extends Calculator {

    public RussianCalculator() {
        super();
        setTariffExtractor(new RubleTariffExtractor());
    }
}
