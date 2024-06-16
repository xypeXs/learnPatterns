package ru.learn.patterns.factory.factorymethod.product;

import java.math.BigDecimal;
import java.util.List;

public class ProductB extends AbstractProduct {
    public ProductB() {
        super(List.of(BigDecimal.valueOf(500), BigDecimal.valueOf(950)));
    }
}
