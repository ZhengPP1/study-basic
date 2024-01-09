package com.bingbing.designpatterns.state.order;

/**
 * 状态转换枚举类
 * @author bingbing
 */
public enum OrderStatusChangeEvent {
    /**
     * 支付 发货 确认收货
     */
    PAYED,DELIVERY,RECEIVED;
}
