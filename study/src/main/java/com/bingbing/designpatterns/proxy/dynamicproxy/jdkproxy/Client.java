package com.bingbing.designpatterns.proxy.dynamicproxy.jdkproxy;

/**
 * 客户端测试类
 * @author : bingbing
 */
public class Client {
    public static void main(String[] args) {
        JdkProxy jdkProxy=new JdkProxy();
        IPerson instance = jdkProxy.getInstance(new ZhaoLiu());
        instance.findLove();
    }

}
