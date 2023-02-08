package com.bingbing.designpatterns.composite.demo.safe;

/**
 * 顶层抽象组件
 * @author : bingbing
 */
public abstract class Directory {
    protected String name;


    public Directory(String name) {
        this.name = name;
    }

    public abstract void show();
}
