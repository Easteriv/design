package com.cus.design.adapter.powerAdapter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhaojiejun
 * @date 2020/10/5 8:46 上午
 **/
public class PowerAdapterTest {
    @DisplayName("电源适配器，将220v适配成5v")
    @Test
    void testPowerAdapter(){
        Dc5 dc5 = new PowerAdapter();
        dc5.outPutDc5();
    }
}
