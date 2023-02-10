package com.bingbing.designpatterns.strategy.promotion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author : bingbing
 */
public class PromotionStrategyFactory {

    private static Map<String, IPromotionStrategy> PROMOTIONS = new HashMap<>();

    static {
        PROMOTIONS.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTIONS.put(PromotionKey.CASHBACK, new CashbackStrategy());
        PROMOTIONS.put(PromotionKey.GROUPBUY, new GroupbuyStrategy());
    }

    public static final IPromotionStrategy EMPTY = new EmptyStrategy();

    public PromotionStrategyFactory() {
    }

    public static IPromotionStrategy getPromotionStraregy(String promotionKey) {
        IPromotionStrategy strategy = PROMOTIONS.get(promotionKey);
        return strategy == null ? EMPTY : strategy;

    }

    private interface PromotionKey {
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }

    public static Set<String> getPromotionKeys(){
        return PROMOTIONS.keySet();
    }
}
