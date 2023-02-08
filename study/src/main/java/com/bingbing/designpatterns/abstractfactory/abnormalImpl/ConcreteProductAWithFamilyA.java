package com.bingbing.designpatterns.abstractfactory.abnormalImpl;

/**
 * 产品族A的具体产品A
 * @author : bingbing
 */
public class ConcreteProductAWithFamilyA implements IProductA{
    @Override
    public void doA() {
        System.out.println("the product A be part of familyA");
    }
}
