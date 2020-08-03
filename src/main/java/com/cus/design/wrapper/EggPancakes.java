package com.cus.design.wrapper;

/**
 * 煎饼加鸡蛋
 * @author zhaojiejun
 * @date 2020/8/3 9:35 下午
 **/
public class EggPancakes extends AbstractDecorator {

    public EggPancakes(AbstractCookie abstractCookie) {
        super(abstractCookie);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加了一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
