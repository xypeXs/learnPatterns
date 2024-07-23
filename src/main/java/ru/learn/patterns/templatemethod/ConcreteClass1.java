package ru.learn.patterns.templatemethod;

public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void simpleOperation2() {
        System.out.println("ConcreteClass1.simpleOperation2");
    }

    @Override
    protected void simpleOperation3() {
        System.out.println("ConcreteClass1.simpleOperation3");
    }
}
