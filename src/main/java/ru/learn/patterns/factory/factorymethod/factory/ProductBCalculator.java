package ru.learn.patterns.factory.factorymethod.factory;

import ru.learn.patterns.factory.factorymethod.product.AbstractProduct;
import ru.learn.patterns.factory.factorymethod.product.ProductB;

public class ProductBCalculator extends AbstractProductCalculator {
    @Override
    protected AbstractProduct getProduct() {
        return new ProductB();
    }
}
