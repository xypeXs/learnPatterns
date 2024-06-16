package ru.learn.patterns.factory.factorymethod.factory;

import ru.learn.patterns.factory.factorymethod.product.AbstractProduct;

import java.math.BigDecimal;
import java.util.List;

public abstract class AbstractProductCalculator {

    protected abstract AbstractProduct getProduct();

    public BigDecimal calculate(BigDecimal multiplier) {
        AbstractProduct product = getProduct();

        List<BigDecimal> tariffList = product.getTariffList();
        return tariffList.stream()
                .reduce(BigDecimal.ZERO, (result, tariff) -> result.add(tariff.multiply(multiplier)));
    }
}
