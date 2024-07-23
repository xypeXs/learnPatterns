package ru.learn.patterns.templatemethod;

public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void simpleOperation2() {
        System.out.println("ConcreteClass2.simpleOperation2");
    }

    @Override
    protected void simpleOperation3() {
        System.out.println("ConcreteClass2.simpleOperation3");
    }

    @Override
    protected void hookOperation() {
        System.out.println("ConcreteClass2.hookOperation");
    }
}
