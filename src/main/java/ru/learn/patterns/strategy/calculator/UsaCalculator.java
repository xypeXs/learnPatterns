package ru.learn.patterns.strategy.calculator;

import ru.learn.patterns.strategy.tariff.USDTariffExtractor;

public class UsaCalculator extends Calculator {

    public UsaCalculator() {
        super();
        setTariffExtractor(new USDTariffExtractor());
    }
}
