package com.bingbing.designpatterns.composite.demo.safe;

/**
 * 文件
 * @author : bingbing
 */
public class File extends Directory{
    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
