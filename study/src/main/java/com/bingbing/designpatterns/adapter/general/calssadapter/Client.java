package com.bingbing.designpatterns.adapter.general.calssadapter;

/**
 * @author : bingbing
 */
public class Client {
    public static void main(String[] args) {
        ITarget adapter = new Adapter();
        adapter.output5V();
    }
}
