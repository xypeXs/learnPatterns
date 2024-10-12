package ru.learn.patterns.proxy.dynamic;

import ru.learn.patterns.proxy.shared.TargetObject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class TargetObjectInvocationHandler implements InvocationHandler {

    private TargetObject targetObject;

    public TargetObjectInvocationHandler(TargetObject targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Additional method invocation handling logic
        System.out.println(LocalDateTime.now() + " INFO: started " + method.getName());
        Object result = method.invoke(targetObject, args);
        System.out.println(LocalDateTime.now() + " INFO: finished " + method.getName());
        return result;
    }
}
