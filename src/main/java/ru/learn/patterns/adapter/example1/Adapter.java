package ru.learn.patterns.adapter.example1;

public class Adapter implements ExpectedInterface {

    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getFio() {
        return adaptee.getSurname() + " " + adaptee.getName() + " " + adaptee.getLastName();
    }
}
