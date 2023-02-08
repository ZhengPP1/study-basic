package com.bingbing.designpatterns.abstractfactory.concreteImpl;

/**
 * @author : bingbing
 */
public class JavaVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("录制java视频");
    }
}
