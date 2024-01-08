package com.bingbing.designpatterns.command.player;

/**
 * Receiver
 * @author bingbing
 */
public class GPlayer {
    public void play(){
        System.out.println("正常播放");
    }

    public void pause(){
        System.out.println("pause=====");
    }

    public void speed(){
        System.out.println("speed======");
    }

    public void stop(){
        System.out.println("stop=======");
    }
}

