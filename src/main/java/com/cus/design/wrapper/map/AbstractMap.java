package com.cus.design.wrapper.map;

import java.util.Map;

/**
 * @author zhaojiejun
 * @date 2020/9/25 10:29 下午
 **/
public abstract class AbstractMap {
    protected abstract Map<String,String> put(String key, String value);
}
