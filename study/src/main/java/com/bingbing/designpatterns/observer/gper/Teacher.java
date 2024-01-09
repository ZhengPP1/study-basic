package com.bingbing.designpatterns.observer.gper;

import java.util.Observable;
import java.util.Observer;

/**
 * @author bingbing
 */
public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gPer = (GPer) o;
        Question question = (Question) arg;
        System.out.println(gPer.getName() + question.getContent() + question.getUserName());

    }
}
