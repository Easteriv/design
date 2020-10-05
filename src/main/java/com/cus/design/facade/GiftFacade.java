package com.cus.design.facade;

/**
 * @author zhaojiejun
 * @date 2020/10/5 11:30 上午
 **/
public class GiftFacade {
    private final GiftPay giftPay = new GiftPay();
    private final GiftMove giftMove = new GiftMove();

    void exchange(Gift gift){
        giftPay.pay(gift);
        giftMove.move(gift);
    }
}
