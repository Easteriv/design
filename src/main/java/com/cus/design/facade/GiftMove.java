package com.cus.design.facade;

/**
 * @author zhaojiejun
 * @date 2020/10/5 11:29 上午
 **/
public class GiftMove {
    void move(Gift gift) {
        System.out.println("物流移动" + gift.getName());
    }
}
