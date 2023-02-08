package com.bingbing.designpatterns.simplefactory;

/**
 * @author : bingbing
 */
public class CourseFactory {
    public Icourse create(Class<? extends Icourse> clazz) {
        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        CourseFactory courseFactory=new CourseFactory();
        Icourse icourse = courseFactory.create(JavaCourse.class);
        icourse.record();
    }


}
