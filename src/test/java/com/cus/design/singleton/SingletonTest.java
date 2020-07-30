package com.cus.design.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhaojiejun
 * @date 2020/7/30 8:25 下午
 **/
public class SingletonTest {
    @Test
    @DisplayName("饿汉式")
    void testHungerSingleton() {
        HungerSingleton instance = HungerSingleton.getInstance();
        HungerSingleton instance2 = HungerSingleton.getInstance();
        Assertions.assertEquals(instance, instance2);
    }

    @Test
    @DisplayName("饱汉式双重锁")
    void testFullSingleton() {
        FullSingleton instance = FullSingleton.getInstance();
        FullSingleton instance2 = FullSingleton.getInstance();
        Assertions.assertEquals(instance, instance2);
    }

    @Test
    @DisplayName("静态代码块")
    void testStaticSingleton() {
        StaticSingleton instance = StaticSingleton.getInstance();
        StaticSingleton instance2 = StaticSingleton.getInstance();
        Assertions.assertEquals(instance, instance2);
    }

    @Test
    @DisplayName("枚举实现单例")
    void testEnumSingleton() {
        EnumSingleton instance = EnumSingleton.getInstance();
        EnumSingleton instance2 = EnumSingleton.getInstance();
        Assertions.assertEquals(instance, instance2);
    }
}
