package com.bingbing.designpatterns.strategy.promotion;

/**
 * 促销活动方案PromotionActivity类
 * @author : bingbing
 */
public class PromotionActivity {
    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){

        this.strategy.doPromotion();
    }
}
