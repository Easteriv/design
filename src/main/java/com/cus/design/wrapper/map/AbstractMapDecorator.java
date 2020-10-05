package com.cus.design.wrapper.map;

import java.util.Map;

/**
 * @author zhaojiejun
 * @date 2020/9/25 10:35 下午
 **/
public abstract class AbstractMapDecorator extends AbstractMap{
    private  AbstractMap abstractMap;

    public AbstractMapDecorator(AbstractMap abstractMap) {
        this.abstractMap = abstractMap;
    }


    @Override
    protected Map<String, String> put(String key, String value) {
        return this.abstractMap.put(key,value);
    }
}
