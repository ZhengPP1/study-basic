package com.bingbing.designpatterns.facade.points;

/**
 * 物流系统
 * @author : bingbing
 */
public class ShippingService {
    public String delivery(GiftInfo giftInfo){
        System.out.println(giftInfo.getName() + "进入物流系统");
        String shippingNo = "666";
        return shippingNo;
    }
}
