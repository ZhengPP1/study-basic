package com.bingbing.designpatterns.singleton;

/**
 * 双重检查锁单例
 * @author : bingbing
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton instance;

    public LazyDoubleCheckSingleton() {
    }


    public static LazyDoubleCheckSingleton getInstance(){
        if (instance==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (instance==null){
                    instance=new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
