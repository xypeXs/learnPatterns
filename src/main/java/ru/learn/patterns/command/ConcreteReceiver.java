package ru.learn.patterns.command;

public class ConcreteReceiver {

    public void on() {
        System.out.println("ConcreteReceiver.on");
    }

    public void off() {
        System.out.println("ConcreteReceiver.off");
    }
}
