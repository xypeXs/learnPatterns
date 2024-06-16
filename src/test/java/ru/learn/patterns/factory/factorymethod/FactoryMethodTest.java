package ru.learn.patterns.factory.factorymethod;

import junit.framework.Assert;
import junit.framework.TestCase;
import ru.learn.patterns.factory.factorymethod.factory.AbstractProductCalculator;
import ru.learn.patterns.factory.factorymethod.factory.ProductACalculator;
import ru.learn.patterns.factory.factorymethod.factory.ProductBCalculator;

import java.math.BigDecimal;

public class FactoryMethodTest extends TestCase {

    public void testProductA() {
        AbstractProductCalculator calculator = new ProductACalculator();

        Assert.assertEquals(calculator.calculate(BigDecimal.valueOf(1.0)), BigDecimal.valueOf(2500.0));
        Assert.assertEquals(calculator.calculate(BigDecimal.valueOf(1.5)), BigDecimal.valueOf(3750.0));
        Assert.assertEquals(calculator.calculate(BigDecimal.valueOf(2.0)), BigDecimal.valueOf(5000.0));
    }

    public void testProductB() {
        AbstractProductCalculator calculator = new ProductBCalculator();

        Assert.assertEquals(calculator.calculate(BigDecimal.valueOf(1.0)), BigDecimal.valueOf(1450.0));
        Assert.assertEquals(calculator.calculate(BigDecimal.valueOf(1.5)), BigDecimal.valueOf(2175.0));
        Assert.assertEquals(calculator.calculate(BigDecimal.valueOf(2.0)), BigDecimal.valueOf(2900.0));

    }
}
