package com.cus.design.facade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhaojiejun
 * @date 2020/10/5 11:32 上午
 **/
public class GiftFacadeTest {
    @Test
    @DisplayName("外观模式")
    void testGiftFacade(){
        GiftFacade giftFacade = new GiftFacade();
        Gift gift = Gift.builder().name("礼品1").cost(12.3).build();
        giftFacade.exchange(gift);
    }
}
