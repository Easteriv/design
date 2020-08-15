package com.cus.design.iterator;

/**
 * @author zhaojiejun
 */
public interface Iterator<E> {
    /**
     * 是否有下一位
     *
     * @return boolean
     * @author zhaojiejun
     **/
    boolean hasNext();

    /**
     * 下一位
     *
     * @author zhaojiejun
     **/
    void next();

    /**
     * 当前元素
     *
     * @return E
     * @author zhaojiejun
     **/
    E currentItem();
}
