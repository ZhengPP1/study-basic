package com.bingbing.designpatterns.facade.points;

/**
 * 支付系统
 * @author : bingbing
 */
public class PaymentService {
    public boolean pay(GiftInfo giftInfo){
        System.out.println("扣减" + giftInfo.getName() + " 积分成功");
        return true;
    }
}
