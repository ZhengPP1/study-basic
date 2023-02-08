package com.bingbing.designpatterns.singleton;

import java.io.Serializable;

/**
 * 一个单例对象创建好后，有时候需要将对象序列化然后写入磁盘，当下次使用时再从磁盘中读取对象并进行反序列化，
 * 将其转化为内存对象。反序列化后的对象会重新分配内存，即重新创建。如果序列化的目标对象为单例对象，则违背了单例模式的初衷，相当于破坏了单例模式。
 * <p>
 * <p>
 * 序列化的情况实现单例模式
 *
 * @author : bingbing
 */
public class SeriableSingleton implements Serializable {

    public static final SeriableSingleton INSTANCE = new SeriableSingleton();

    public SeriableSingleton() {
    }

    public static SeriableSingleton getInstance(){

        return INSTANCE;
    }

    /**
     * 增加readResolve方法即可在序列化的情况下也实现单例
     * @return
     */
    private Object readResolve(){
        return INSTANCE;
    }
}
