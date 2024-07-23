package ru.learn.patterns.templatemethod;

public abstract class AbstractClass {

    public final void process() {
        simpleOperation1();
        simpleOperation2();
        hookOperation();
        simpleOperation3();
    }

    protected void simpleOperation1() {
        System.out.println("AbstractClass.simpleOperation1");
    }

    // реализация предоставляется подклассами
    protected abstract void simpleOperation2();

    // реализация предоставляется подклассами
    protected abstract void simpleOperation3();

    // Метод-перехватчик. Реализация по умолчанию
    protected void hookOperation() {
        // nothing
    }
}
