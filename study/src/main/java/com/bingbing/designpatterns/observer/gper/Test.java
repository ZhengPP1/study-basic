package com.bingbing.designpatterns.observer.gper;

/**
 * @author bingbing
 */
public class Test {
    public static void main(String[] args) {
        GPer gPer=GPer.getInstance();
        gPer.addObserver(new Teacher("tom"));
        gPer.publishQuestion(new Question("bingbing","kdjekfkle;k"));
    }
}
