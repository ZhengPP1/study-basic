package com.bingbing.designpatterns.singleton;

/**
 * 线程单例
 * ThreadLocal不能保证其创建的对象是全局唯一的，但能保证在单个线程中是唯一的，是线程安全的
 * @author : bingbing
 */
public class ThreadLocalSingleton {
    public static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL_INSTANCE =new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public ThreadLocalSingleton() {

    }
    public static ThreadLocalSingleton getInstance(){

        return THREAD_LOCAL_INSTANCE.get();
    }
}
