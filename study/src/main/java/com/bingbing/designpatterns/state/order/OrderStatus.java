package com.bingbing.designpatterns.state.order;

/**
 * 订单状态枚举类
 * @author bingbing
 */
public enum OrderStatus {
    /**
     * 待支付 待发货 待收货 订单结束
     */
    WAIT_PAYMENT,WAIT_DELIVER,WAIT_RECEIVE,FINISH;
}
