package ru.learn.patterns.facade;

public class SubSystem3 {

    public void start() {
        System.out.println("SubSystem3 started");
    }

    public void sleep(long millis) {
        System.out.printf("SubSystem3 is sleeping for %d millis%n", millis);
    }
}
