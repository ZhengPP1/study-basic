package com.bingbing.designpatterns.abstractfactory.concreteImpl;

/**
 * @author : bingbing
 */
public class Client {
    public static void main(String[] args) {
        JavaCourseFactory factory=new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }
}
