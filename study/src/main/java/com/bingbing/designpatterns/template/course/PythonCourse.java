package com.bingbing.designpatterns.template.course;

/**
 * @author : bingbing
 */
public class PythonCourse extends AbastractCourse{
    @Override
    protected void checkHomework() {
        System.out.println("检查python作业");
    }
}
