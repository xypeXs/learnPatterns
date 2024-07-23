package ru.learn.patterns.templatemethod;

import junit.framework.TestCase;

public class TemplateMethodTest extends TestCase {

    public void testConcrete1() {
        System.out.println("concrete1 ...");

        AbstractClass concrete1 = new ConcreteClass1();
        concrete1.process();
    }

    public void testConcrete2() {
        System.out.println("concrete2 ...");

        AbstractClass concrete2 = new ConcreteClass2();
        concrete2.process();
    }
}
