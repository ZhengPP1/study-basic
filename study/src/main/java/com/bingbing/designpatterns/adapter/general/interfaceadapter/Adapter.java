package com.bingbing.designpatterns.adapter.general.interfaceadapter;

/**
 * @author : bingbing
 */
public abstract class Adapter implements ITarget{
    protected Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public int request1() {
        return 0;
    }

    public int request2() {
        return 0;
    }

    public int request3() {
        return 0;
    }

    public int request4() {
        return 0;
    }

}
