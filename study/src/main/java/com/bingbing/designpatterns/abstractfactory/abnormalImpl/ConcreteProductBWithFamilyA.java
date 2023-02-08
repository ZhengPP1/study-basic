package com.bingbing.designpatterns.abstractfactory.abnormalImpl;

/**
 * 产品族A的具体产品B
 * @author : bingbing
 */
public class ConcreteProductBWithFamilyA implements IProductB{
    @Override
    public void doB() {
        System.out.println("the product B be part of familyA");
    }
}
