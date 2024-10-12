package ru.learn.patterns.proxy.dynamic;

import ru.learn.patterns.proxy.shared.TargetObject;

public class TargetObjectImpl implements TargetObject {

    @Override
    public void doSomething() {
        System.out.println("TargetObjectImpl is doing something");
    }
}
