package com.bingbing.designpatterns.abstractfactory.abnormalImpl;

/**
 * 抽象工厂
 * @author : bingbing
 */
public interface IFactory {
    IProductA makeIProductA();

    IProductB makeIProductB();
}
