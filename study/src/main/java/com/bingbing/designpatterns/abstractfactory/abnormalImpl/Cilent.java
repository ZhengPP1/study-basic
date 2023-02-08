package com.bingbing.designpatterns.abstractfactory.abnormalImpl;

/**
 * @author : bingbing
 */
public class Cilent {
    public static void main(String[] args) {
        IFactory factory=new ConcreteFactoryA();
        factory.makeIProductA();
        factory.makeIProductB();

        factory=new ConcreteFactoryB();
        factory.makeIProductA();
        factory.makeIProductB();
    }
}
