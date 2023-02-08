package com.bingbing.designpatterns.adapter.general.calssadapter;

/**
 * 创建Adaptee角色，需要被转换的对象AC220类，表示220V交流电。
 * @author : bingbing
 */
public class Adaptee {

    public int outputAC220V(){

        int output=220;
        System.out.println("输出"+output+"V");
        return output;
    }
}
