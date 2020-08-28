package com.cus.design.singleton;

/**
 * @author zhaojiejun
 * @date 2020/7/30 8:34 下午
 **/
public class StaticSingleton {
    private static class SingletonHold{
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }
    private StaticSingleton(){};

    public static StaticSingleton getInstance(){
        return SingletonHold.INSTANCE;
    }
}
