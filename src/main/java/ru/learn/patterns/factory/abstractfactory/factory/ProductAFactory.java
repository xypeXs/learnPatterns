package ru.learn.patterns.factory.abstractfactory.factory;

import ru.learn.patterns.factory.abstractfactory.product.AbstractProduct;
import ru.learn.patterns.factory.abstractfactory.product.ProductA;
import ru.learn.patterns.factory.abstractfactory.productconfiguration.AbstractProductConfiguration;
import ru.learn.patterns.factory.abstractfactory.productconfiguration.ProductAConfiguration;

public class ProductAFactory extends AbstractProductFactory {
    @Override
    public AbstractProduct getProduct() {
        return new ProductA();
    }

    @Override
    public AbstractProductConfiguration getProductConfiguration() {
        return new ProductAConfiguration();
    }
}
