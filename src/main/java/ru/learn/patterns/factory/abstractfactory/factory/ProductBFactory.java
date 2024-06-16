package ru.learn.patterns.factory.abstractfactory.factory;

import ru.learn.patterns.factory.abstractfactory.product.AbstractProduct;
import ru.learn.patterns.factory.abstractfactory.product.ProductB;
import ru.learn.patterns.factory.abstractfactory.productconfiguration.AbstractProductConfiguration;
import ru.learn.patterns.factory.abstractfactory.productconfiguration.ProductBConfiguration;

public class ProductBFactory extends AbstractProductFactory {
    @Override
    public AbstractProduct getProduct() {
        return new ProductB();
    }

    @Override
    public AbstractProductConfiguration getProductConfiguration() {
        return new ProductBConfiguration();
    }
}
