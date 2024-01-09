package com.bingbing.designpatterns.interpreter.calculate;

/**
 * @author bingbing
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("result:" + new GPCalculator("10 + 30").calculate());
        System.out.println("result:" + new GPCalculator("10 + 30 - 20").calculate());
        System.out.println("result:" + new GPCalculator("100 * 2 + 400 * 2 + 66").calculate());

    }
}
