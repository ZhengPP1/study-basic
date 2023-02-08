package com.bingbing.designpatterns.abstractfactory.abnormalImpl;

/**
 * 具体工厂类A
 * @author : bingbing
 */
public class ConcreteFactoryA implements IFactory{
    @Override
    public IProductA makeIProductA() {
        return new ConcreteProductAWithFamilyA();
    }

    @Override
    public IProductB makeIProductB() {
        return new ConcreteProductBWithFamilyA();
    }
}
