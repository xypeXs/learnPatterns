package ru.learn.patterns.facade;

public class SubSystem1 {

    public void preconfigure() {
        System.out.println("SubSystem1 is preconfigured");
    }

    public void setup() {
        System.out.println("SubSystem1 is setup");
    }

    public void start() {
        System.out.println("SubSystem1 started");
    }
}
