package com.bingbing.designpatterns.abstractfactory.concreteImpl;

/**
 * 具体产品
 * @author : bingbing
 */
public class JavaNote implements INote {

    @Override
    public void edit() {
        System.out.println("java笔记");
    }
}
