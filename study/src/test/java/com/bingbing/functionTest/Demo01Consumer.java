package com.bingbing.functionTest;


import java.util.function.Consumer;

/**
 * @author : bingbing
 * java.util.function.Consumer 接口则正好与Supplier接口相反，它不是生产一个数据，而是消费一个数据，其数据类型由泛型决定。
 * Consumer 接口中包含抽象方法void accept(T t) ，意为消费一个指定泛型的数据。
 */
public class Demo01Consumer {

    public static void method(String name, Consumer<String> consumer){
        consumer.accept(name);
    }
    public static void main(String[] args) {
        method("12345",name->{
            String s = new StringBuffer(name).reverse().toString();
            System.out.println(s);
        });
    }

}
