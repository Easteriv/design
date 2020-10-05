package com.cus.design.wrapper.map;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaojiejun
 * @date 2020/9/25 10:30 下午
 **/
public class MyHashMap extends AbstractMap {
    @Override
    protected Map<String, String> put(String key, String value) {
        HashMap<String, String> map = Maps.newHashMapWithExpectedSize(16);
        map.put(key, value);
        return map;
    }
}
