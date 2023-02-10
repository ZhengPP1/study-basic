package com.bingbing.designpatterns.delegate.simple;

/**
 * @author : bingbing
 */
public class Test {
    public static void main(String[] args) {
        new Boss().command("python",new Leader());
        new Boss().command("poster",new Leader());
        new Boss().command("sale",new Leader());


    }
}
