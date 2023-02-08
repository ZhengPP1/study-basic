package com.bingbing.designpatterns.abstractfactory.concreteImpl;

/**
 * @author : bingbing
 */
public class PythonVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("python record start");
    }
}
