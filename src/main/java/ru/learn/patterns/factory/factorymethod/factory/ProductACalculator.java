package ru.learn.patterns.factory.factorymethod.factory;

import ru.learn.patterns.factory.factorymethod.product.AbstractProduct;
import ru.learn.patterns.factory.factorymethod.product.ProductA;

public class ProductACalculator extends AbstractProductCalculator {
    @Override
    protected AbstractProduct getProduct() {
        return new ProductA();
    }
}
