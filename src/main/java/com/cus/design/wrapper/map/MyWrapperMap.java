package com.cus.design.wrapper.map;

import java.util.Map;

/**
 * @author zhaojiejun
 * @date 2020/9/25 10:38 下午
 **/
public class MyWrapperMap extends AbstractMapDecorator {
    public MyWrapperMap(AbstractMap abstractMap) {
        super(abstractMap);
    }

    @Override
    public Map<String, String> put(String key, String value) {
        value += "_wrapper";
        return super.put(key, value);
    }


}
