package com.bingbing.designpatterns.adapter.general.objectadapter;

/**
 * @author : bingbing
 */
public class Adapter implements ITarget{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int request() {
        return adaptee.specificRequest()/10;
    }
}
