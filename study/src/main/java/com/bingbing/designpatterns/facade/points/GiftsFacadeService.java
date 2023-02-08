package com.bingbing.designpatterns.facade.points;

/**
 * 外观角色
 *
 * @author : bingbing
 */
public class GiftsFacadeService {
    private QualifyService qualifyService = new QualifyService();

    private PaymentService paymentService = new PaymentService();

    private ShippingService shippingService = new ShippingService();

    /**
     * 兑换
     *
     * @param giftInfo
     */
    public void exchange(GiftInfo giftInfo) {

        if (qualifyService.isAvailable(giftInfo)) {

            if (paymentService.pay(giftInfo)) {
                String shippingNo = shippingService.delivery(giftInfo);
                System.out.println("物流系统下单成功，物流单号是：" + shippingNo);
            }
        }


    }


}
