package com.bingbing.designpatterns.singleton;

/**
 * 饿汉单例
 * @author : bingbing
 */
public class Singleton {
    public static final Singleton INSTANCE =new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
