package ru.learn.patterns.factory.abstractfactory.factory;

import ru.learn.patterns.factory.abstractfactory.product.AbstractProduct;
import ru.learn.patterns.factory.abstractfactory.productconfiguration.AbstractProductConfiguration;

public abstract class AbstractProductFactory {
    public abstract AbstractProduct getProduct();

    public abstract AbstractProductConfiguration getProductConfiguration();
}
