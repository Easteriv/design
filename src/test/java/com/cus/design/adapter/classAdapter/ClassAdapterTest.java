package com.cus.design.adapter.classAdapter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhaojiejun
 * @date 2020/10/5 8:29 上午
 **/
public class ClassAdapterTest {
    @DisplayName("类适配器")
    @Test
    public void testClassAdapter() {
        Target target = new Adapter();
        target.request();
    }
}
