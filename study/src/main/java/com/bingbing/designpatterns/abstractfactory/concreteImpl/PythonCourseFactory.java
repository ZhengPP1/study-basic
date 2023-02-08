package com.bingbing.designpatterns.abstractfactory.concreteImpl;

/**
 * 具体工厂
 * @author : bingbing
 */
public class PythonCourseFactory extends CourseFactory {
    @Override
    protected INote createNote() {
        super.init();
        return new PythonNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
}
