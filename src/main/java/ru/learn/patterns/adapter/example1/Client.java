package ru.learn.patterns.adapter.example1;

public class Client {

    public String getFio() {
        ExpectedInterface adaptedObject = createAdapter();
        return adaptedObject.getFio();
    }

    public ExpectedInterface createAdapter() {
        Adaptee adaptee = new Adaptee();
        return new Adapter(adaptee);
    }
}
