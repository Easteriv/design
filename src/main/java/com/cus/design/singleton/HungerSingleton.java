package com.cus.design.singleton;

/**
 * 饿汉式
 *
 * @author zhaojiejun
 * @date 2020/7/30 8:21 下午
 **/
public class HungerSingleton {
    private static final HungerSingleton instance = new HungerSingleton();

    private HungerSingleton() {
    }

    public static HungerSingleton getInstance() {
        return instance;
    }
}
