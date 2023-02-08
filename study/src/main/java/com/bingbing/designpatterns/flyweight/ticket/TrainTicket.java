package com.bingbing.designpatterns.flyweight.ticket;

import java.util.Random;

/**
 * 具体享元模式
 * @author : bingbing
 */
public class TrainTicket implements ITicket{
    private String from;
    private String to;
    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }


    @Override
    public void showInfo(String bunk) {
        this.price=new Random().nextInt(500);
        System.out.println(String.format("%s->%s: %s价格：%s元",this.from,to,bunk,this.price));
    }
}











