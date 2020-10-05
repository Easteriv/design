package com.cus.design.adapter.classAdapter;

/**
 * @author zhaojiejun
 * @date 2020/10/5 8:24 上午
 **/
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
