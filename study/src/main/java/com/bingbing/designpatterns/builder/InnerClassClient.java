package com.bingbing.designpatterns.builder;

/**
 * @author : bingbing
 */
public class InnerClassClient {
    public static void main(String[] args) {
        InnerClassCourse course=new  InnerClassCourse.Builder()
                .addName("bingbing").addNote("ceshi").addHomework("zouye").builder();
        System.out.println(course);

    }
}
