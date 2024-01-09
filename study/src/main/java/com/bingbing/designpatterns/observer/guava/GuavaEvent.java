package com.bingbing.designpatterns.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * 监听事件
 * @author bingbing
 */
public class GuavaEvent {
    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法："+str);

    }
}
