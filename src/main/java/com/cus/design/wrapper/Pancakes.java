package com.cus.design.wrapper;

/**
 * 普通饼干
 * @author zhaojiejun
 * @date 2020/8/3 9:34 下午
 **/
public class Pancakes extends AbstractCookie{
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 3;
    }
}
