package com.bingbing.designpatterns.adapter.general.interfaceadapter;

/**
 * @author : bingbing
 */
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee()){
            @Override
            public int request1() {
                return adaptee.specificRequest();
            }
        };
        System.out.println(adapter.request1());
    }
}
