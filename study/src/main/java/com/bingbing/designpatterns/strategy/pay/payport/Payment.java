package com.bingbing.designpatterns.strategy.pay.payport;

import com.bingbing.designpatterns.strategy.pay.MsgResult;

/**
 * 定义支付规范和支付逻辑
 */
public abstract class Payment {
    public abstract String getName();

    // 通用逻辑放到抽象类里面实现
    public MsgResult pay(String uid, double amount){
        if (queryBalance(uid)<amount){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付成功","支付金额"+amount);
    }

    protected abstract double queryBalance(String uid);

}
