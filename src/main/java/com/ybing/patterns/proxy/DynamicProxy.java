package com.ybing.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    private Object target ;

    public Object createProxyObject(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(target, args);
        return null;
    }

    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy();
        Man ximenqing = new Man();
        ximenqing.setHandsome(true);
        ximenqing.setHight(180);
        ximenqing.setWeight(145);
        ximenqing.setManey(1000000000000l);
        FaleMan pjl = new FaleMan();
        Person wp = (Person)proxy.createProxyObject(pjl);
        wp.watch(ximenqing);
    }
}
