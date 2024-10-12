package ru.learn.patterns.proxy.dynamic;

import ru.learn.patterns.proxy.shared.TargetObject;

import java.lang.reflect.Proxy;

public class TargetObjectFactory {

    public static TargetObject createTargetObjectProxyLogger(TargetObject targetObjectImpl) {
        return (TargetObject) Proxy.newProxyInstance(
                targetObjectImpl.getClass().getClassLoader(),
                targetObjectImpl.getClass().getInterfaces(),
                new TargetObjectInvocationHandler(targetObjectImpl)
        );
    }
}
