package com.bingbing.functionTest;

import java.util.function.Supplier;

/**
 * @author : bingbing
 * java.util.function.Supplier 接口仅包含一个无参的方法：T get() 。用来获取一个泛型参数指定类型的对象数据。
 * 由于这是一个函数式接口，这也就意味着对应的Lambda表达式需要“对外提供”一个符合泛型类型的对象数据。
 */
public class Demo01Supplier {
    public static void main(String[] args) {
        String s = getString(() -> {
            return "123";
        });
        String s1 = getString(() -> "1233");


    }


    public static String getString(Supplier<String> supplier){
        return supplier.get();
    }
}
