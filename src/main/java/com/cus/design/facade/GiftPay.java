package com.cus.design.facade;

/**
 * @author zhaojiejun
 * @date 2020/10/5 11:28 上午
 **/
public class GiftPay {
    void pay(Gift gift) {
        System.out.println("价格" + gift.getCost());
    }
}
