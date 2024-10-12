package ru.learn.patterns.proxy.remote;

import ru.learn.patterns.proxy.shared.TargetObject;

public class TargetObjectProxy implements TargetObject {

    @Override
    public void doSomething() {
        // REST / SOAP / RMI вызов удалённого объекта в другом сервисе / JVM
    }
}
