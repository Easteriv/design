package com.cus.design.wrapper;

/**
 * 煎饼加香肠
 * @author zhaojiejun
 * @date 2020/8/3 9:48 下午
 **/
public class SausagePancakes extends AbstractDecorator {
    public SausagePancakes(AbstractCookie abstractCookie) {
        super(abstractCookie);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加了一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 3;
    }
}
