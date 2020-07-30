package com.cus.design.singleton;

/**
 * @author zhaojiejun
 */

public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
