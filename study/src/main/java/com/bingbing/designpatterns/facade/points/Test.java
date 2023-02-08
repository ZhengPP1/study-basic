package com.bingbing.designpatterns.facade.points;

/**
 * @author : bingbing
 */
public class Test {
    public static void main(String[] args) {
        GiftInfo giftInfo=new GiftInfo();
        giftInfo.setName("《Spring5核心原理》");
        GiftsFacadeService service=new GiftsFacadeService();
        service.exchange(giftInfo);
    }
}
