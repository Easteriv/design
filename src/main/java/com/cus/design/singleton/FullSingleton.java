package com.cus.design.singleton;

/**
 * @author zhaojiejun
 * @date 2020/7/30 8:30 下午
 **/
public class FullSingleton {
    private static volatile FullSingleton instance;

    private FullSingleton() {
    }

    public static FullSingleton getInstance() {
        if (instance == null) {
            synchronized (FullSingleton.class) {
                if (instance == null) {
                    instance = new FullSingleton();
                }
            }
        }
        return instance;
    }
}
