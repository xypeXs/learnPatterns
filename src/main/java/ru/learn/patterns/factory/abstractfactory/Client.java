package ru.learn.patterns.factory.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Setter;
import ru.learn.patterns.factory.abstractfactory.factory.AbstractProductFactory;
import ru.learn.patterns.factory.abstractfactory.product.AbstractProduct;
import ru.learn.patterns.factory.abstractfactory.productconfiguration.AbstractProductConfiguration;

@Setter
@AllArgsConstructor
public class Client {
    private AbstractProductFactory factory;

    public void process() {
        AbstractProduct product = factory.getProduct();
        AbstractProductConfiguration productConfiguration = factory.getProductConfiguration();

        System.out.println("PRODUCT " + product.getSysName() + " is valid from " + productConfiguration.getStartDate() + " to " + productConfiguration.getFinishDate());
    }
}
