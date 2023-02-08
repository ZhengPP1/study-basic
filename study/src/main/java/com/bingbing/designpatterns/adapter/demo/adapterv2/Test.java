package com.bingbing.designpatterns.adapter.demo.adapterv2;

/**
 * @author bingbing
 * @Created 2023/2/8 10:55 下午
 */
public class Test {
    public static void main(String[] args) {
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        adapter.loginForQQ("aaaaa");
    }
}
