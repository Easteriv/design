package com.cus.design.adapter.objectAdapter;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhaojiejun
 * @date 2020/10/5 8:29 上午
 **/
public class ObjectAdapterTest {
    @DisplayName("对象适配器")
    @Test
    public void testObjectAdapter() {
        Target target = new Adapter();
        target.request();
    }
}
