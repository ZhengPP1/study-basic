package com.bingbing.designpatterns.abstractfactory.concreteImpl;

/**
 * 抽象工厂
 * @author : bingbing
 */
public abstract class CourseFactory {
    public void init(){
        System.out.println("初始化其他数据");
    }
    protected abstract INote createNote();

    protected abstract IVideo createVideo();

}
