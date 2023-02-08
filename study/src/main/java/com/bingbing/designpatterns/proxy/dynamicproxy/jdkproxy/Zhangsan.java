package com.bingbing.designpatterns.proxy.dynamicproxy.jdkproxy;


/**
 * 真实主题角色
 * @author : bingbing
 */
public class Zhangsan implements IPerson {

    public void findLove() {
        System.out.println("张三要求:xxxxxxx");
    }

    public void buyInsure() {
        System.out.println("30万");
    }

}
