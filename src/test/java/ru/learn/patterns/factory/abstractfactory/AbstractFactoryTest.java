package ru.learn.patterns.factory.abstractfactory;

import junit.framework.TestCase;
import ru.learn.patterns.factory.abstractfactory.factory.AbstractProductFactory;
import ru.learn.patterns.factory.abstractfactory.factory.ProductAFactory;
import ru.learn.patterns.factory.abstractfactory.factory.ProductBFactory;

public class AbstractFactoryTest extends TestCase {

    public void testProductA() {
        AbstractProductFactory factory = new ProductAFactory();
        Client client = new Client(factory);
        client.process();
    }

    public void testProductB() {
        AbstractProductFactory factory = new ProductBFactory();
        Client client = new Client(factory);
        client.process();
    }
}
