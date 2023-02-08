package com.bingbing.designpatterns.singleton;

/**
 * @author : bingbing
 */
public class LazySimpleSingleton {
    public static LazySimpleSingleton INSTANCE = null;

    public LazySimpleSingleton() {
    }

    public static LazySimpleSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySimpleSingleton();
        }
        return INSTANCE;
    }

}
