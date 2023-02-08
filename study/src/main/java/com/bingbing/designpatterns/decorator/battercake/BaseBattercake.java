package com.bingbing.designpatterns.decorator.battercake;

/**
 * 基础套餐
 * @author : bingbing
 */
public class BaseBattercake extends Battercake{
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
