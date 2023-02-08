package com.bingbing.designpatterns.abstractfactory.abnormalImpl;

/**
 * @author : bingbing
 */
public class ConcreteProductBWithFamilyB implements IProductB {

    @Override
    public void doB() {
        System.out.println("the product B be part of familyB");
    }
}
