package com.cus.design.adapter.objectAdapter;


/**
 * @author zhaojiejun
 * @date 2020/10/5 8:24 上午
 **/
public class Adapter implements Target {
    private final Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
