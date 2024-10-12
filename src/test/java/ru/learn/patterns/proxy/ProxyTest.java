package ru.learn.patterns.proxy;

import junit.framework.TestCase;
import ru.learn.patterns.proxy.dynamic.TargetObjectFactory;
import ru.learn.patterns.proxy.dynamic.TargetObjectImpl;
import ru.learn.patterns.proxy.shared.TargetObject;

public class ProxyTest extends TestCase {

    public void testDynamicProxy() {
        TargetObject targetObjectImpl = new TargetObjectImpl();
        TargetObject targetObjectProxy = TargetObjectFactory.createTargetObjectProxyLogger(targetObjectImpl);
        targetObjectProxy.doSomething();
    }
}
