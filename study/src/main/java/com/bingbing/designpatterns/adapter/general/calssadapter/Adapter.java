package com.bingbing.designpatterns.adapter.general.calssadapter;

/**
 * @author : bingbing
 */
public class Adapter extends Adaptee implements ITarget{
    @Override
    public int output5V() {

        return super.outputAC220V()/44;
    }
}
