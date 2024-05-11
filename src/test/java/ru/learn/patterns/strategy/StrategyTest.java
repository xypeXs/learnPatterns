package ru.learn.patterns.strategy;

import junit.framework.Assert;
import junit.framework.TestCase;
import ru.learn.patterns.strategy.calculator.Calculator;
import ru.learn.patterns.strategy.calculator.RussianCalculator;
import ru.learn.patterns.strategy.calculator.UsaCalculator;
import ru.learn.patterns.strategy.tariff.RubleTariffExtractor;
import ru.learn.patterns.strategy.tariff.USDTariffExtractor;

public class StrategyTest extends TestCase {

    public void testTariffList() {
        Calculator ruCalculator = new RussianCalculator();
        Calculator usaCalculator = new UsaCalculator();

        Assert.assertEquals((new RubleTariffExtractor()).getTariffList(), ruCalculator.getTariffList());
        Assert.assertEquals((new USDTariffExtractor()).getTariffList(), usaCalculator.getTariffList());
    }
}
