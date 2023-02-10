package com.bingbing.designpatterns.strategy.promotion;

import java.util.Set;

/**
 * @author : bingbing
 */
public class TestFactory {
    public static void main(String[] args) {
        Set<String> promotionKeys = PromotionStrategyFactory.getPromotionKeys();
        String promotionKey="COUPON";
        IPromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStraregy(promotionKey);
        promotionStrategy.doPromotion();
    }
}
