package com.cus.design.wrapper;

/**
 *
 * @author zhaojiejun
 * @date 2020/8/3 9:35 下午
 **/
public abstract class AbstractDecorator extends AbstractCookie {
    private AbstractCookie abstractCookie;

    public AbstractDecorator(AbstractCookie abstractCookie) {
        this.abstractCookie = abstractCookie;
    }

    @Override
    protected String getDesc() {
        return this.abstractCookie.getDesc();
    }

    @Override
    protected int cost() {
        return this.abstractCookie.cost();
    }
}
