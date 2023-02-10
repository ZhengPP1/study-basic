package com.bingbing.designpatterns.strategy.promotion;

/**
 * @author : bingbing
 */
public class Test {
    public static void main(String[] args) {

        PromotionActivity promotionActivity = new PromotionActivity(new CouponStrategy());
        promotionActivity.execute();

    }
}
