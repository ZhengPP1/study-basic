package com.bingbing.designpatterns.observer.gper;

import java.util.Observable;

/**
 * @author bingbing
 */
public class GPer extends Observable {
    private String name = "circle";

    private static GPer gPer = null;
    public static GPer getInstance(){
        if (null==gPer){
            gPer=new GPer();
        }
        return gPer;
    }

    public String getName() {
        return name;
    }


    public void publishQuestion(Question question){
        setChanged();
        notifyObservers(question);
    }


}
