package com.cus.design.wrapper;

/**
 * 抽象饼干
 * https://www.javazhiyin.com/33987.html
 * @author zhaojiejun
 * @date 2020/8/3 9:28 下午
 **/
public abstract class AbstractCookie {
    /**
     * 获取名称
     *
     * @return java.lang.String
     * @author zhaojiejun
     **/
    protected abstract String getDesc();

    /**
     * 价格
     * @return int
     * @author zhaojiejun
     **/
    protected abstract int cost();
}
