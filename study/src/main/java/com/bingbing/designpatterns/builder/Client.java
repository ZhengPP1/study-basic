package com.bingbing.designpatterns.builder;

/**
 * 业务端代码
 * @author : bingbing
 */
public class Client {
    public static void main(String[] args) {
        CourseBuilder builder=new CourseBuilder().addName("bingbing").addNote("lalal");
        Course course = builder.build();
        System.out.println(course);
    }
}
