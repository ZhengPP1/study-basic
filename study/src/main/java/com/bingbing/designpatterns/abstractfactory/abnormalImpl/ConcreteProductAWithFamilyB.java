package com.bingbing.designpatterns.abstractfactory.abnormalImpl;

/**
 * @author : bingbing
 */
public class ConcreteProductAWithFamilyB implements IProductA {

    @Override
    public void doA() {
        System.out.println("the product A be part of familyB");
    }
}
