package ru.learn.patterns.factory.factorymethod.product;

import java.math.BigDecimal;
import java.util.List;

public class ProductA extends AbstractProduct {
    public ProductA() {
        super(List.of(BigDecimal.valueOf(1000), BigDecimal.valueOf(1500)));
    }
}
