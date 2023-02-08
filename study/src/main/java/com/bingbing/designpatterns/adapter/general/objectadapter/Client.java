package com.bingbing.designpatterns.adapter.general.objectadapter;

/**
 * 对象适配器的原理就是通过组合来实现适配器功能。
 * 具体做法是，首先让Adapter实现ITarget接口，然后内部持有Adaptee实例，最后在ITarget接口规定的方法内转换Adaptee。
 * @author : bingbing
 */
public class Client {
    public static void main(String[] args) {
        ITarget adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
