package com.bingbing.designpatterns.template.course;

/**
 * @author : bingbing
 */
public class Test {
    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.setNeedCheckHomework(false);
        javaCourse.createCourse();

        PythonCourse pythonCourse = new PythonCourse();
        pythonCourse.createCourse();
    }
}
