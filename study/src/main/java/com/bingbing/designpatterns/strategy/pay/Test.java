package com.bingbing.designpatterns.strategy.pay;

import com.bingbing.designpatterns.strategy.pay.payport.PayStrategy;

/**
 * @author : bingbing
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order("1", "292929", 389.23);
        System.out.println(order.pay(PayStrategy.ALI_PAY));


    }
}
