package com.bingbing.designpatterns.facade.points;

/**
 * 积分系统
 * @author : bingbing
 */
public class QualifyService {
    public boolean isAvailable(GiftInfo giftInfo){
        System.out.println("校验" +giftInfo.getName() + "积分通过,库存通过。");
        return true;
    }
}
