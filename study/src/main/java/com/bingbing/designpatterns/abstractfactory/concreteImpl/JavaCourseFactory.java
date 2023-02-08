package com.bingbing.designpatterns.abstractfactory.concreteImpl;

/**
 * 具体工厂
 * @author : bingbing
 */
public class JavaCourseFactory extends CourseFactory {
    @Override
    protected INote createNote() {
        super.init();
        return new JavaNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}
