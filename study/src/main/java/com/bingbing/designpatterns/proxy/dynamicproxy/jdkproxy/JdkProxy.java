package com.bingbing.designpatterns.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 基于JDK动态代理
 * @author : bingbing
 */
public class JdkProxy implements InvocationHandler {
    private IPerson target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

    public IPerson getInstance(IPerson target) {
        this.target = target;
        Class<? extends IPerson> clazz = target.getClass();
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }






    private void after() {
        System.out.println("双方同意，开始交往");
    }

    private void before() {
        System.out.println("已经收集到你的需求，开始物色");
    }

}
