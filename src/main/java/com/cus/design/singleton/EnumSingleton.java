package com.cus.design.singleton;

/**
 * @author zhaojiejun
 */

public enum EnumSingleton {
    INSTANCE{
        @Override
        public void print(){
            System.out.println("helloWorld");
        }
    };
    protected abstract void print();
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
