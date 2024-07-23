package ru.learn.patterns.facade;

import junit.framework.TestCase;

public class FacadeTest extends TestCase {

    public void testFacade() {
        Facade facade = createFacade();

        facade.start();
        facade.getSubSystem3().sleep(1000);
    }

    public Facade createFacade() {
        SubSystem1 subSystem1 = new SubSystem1();
        SubSystem2 subSystem2 = new SubSystem2();
        SubSystem3 subSystem3 = new SubSystem3();

        return new Facade(subSystem1, subSystem2, subSystem3);
    }
}
