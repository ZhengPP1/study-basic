package com.bingbing.designpatterns.delegate.simple;

/**
 * @author : bingbing
 */
public class Boss {
    public void command(String task,Leader leader){
        leader.doing(task);
    }
}
