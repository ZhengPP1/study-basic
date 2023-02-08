package com.bingbing.designpatterns.abstractfactory.abnormalImpl;

/**
 * @author : bingbing
 */
public class ConcreteFactoryB implements IFactory {

    @Override
    public IProductA makeIProductA() {
        return new ConcreteProductAWithFamilyB();
    }

    @Override
    public IProductB makeIProductB() {
        return new ConcreteProductBWithFamilyB()
                ;
    }
}
