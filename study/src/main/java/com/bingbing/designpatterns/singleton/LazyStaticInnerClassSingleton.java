package com.bingbing.designpatterns.singleton;

/**
 * 静态内部类单例
 *
 * @author : bingbing
 */
public class LazyStaticInnerClassSingleton {
    public LazyStaticInnerClassSingleton() {
    }

    private static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        public static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }


}
