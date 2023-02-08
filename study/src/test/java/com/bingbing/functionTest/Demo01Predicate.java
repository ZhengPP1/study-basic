package com.bingbing.functionTest;

import java.util.function.Predicate;

/**
 * @author : bingbing
 * 有时候我们需要对某种类型的数据进行判断，从而得到一个boolean值结果。这时可以使用java.util.function.Predicate 接口。
 * Predicate接口中包含一个抽象方法：
 *
 * boolean test(T t):用来对指定数据类型数据进行判断的方法
 * 结果:
 * 符合条件,返回true
 * 不符合条件,返回false
 */
public class Demo01Predicate {

    public static boolean checkString(String s, Predicate<String> pre) {

        return pre.test(s);
    }

    public static void main(String[] args) {
        String s = "123456";
        boolean b = checkString(s, str -> str.length() > 5);
        System.out.println(b);
    }

}
