package com.cus.design.builder;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zhaojiejun
 * @date 2020/8/2 1:19 下午
 **/
public class ResourcePoolConfig {

    private static final int DEFAULT_MAX_TOTAL = 8;

    private static final int DEFAULT_MAX_IDLE = 8;

    private static final int DEFAULT_MIN_IDLE = 0;


    private String name;

    private int maxTotal = DEFAULT_MAX_TOTAL;

    private int maxIdle = DEFAULT_MAX_IDLE;

    private int minIdle = DEFAULT_MIN_IDLE;

    public ResourcePoolConfig(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("name should not be empty.");
        }
        this.name = name;
    }

    public void setMaxTotal(Integer maxTotal) {
        if (maxTotal != null) {
            if (maxTotal <= 0) {
                throw new IllegalArgumentException("maxTotal should be positive.");
            }
            this.maxTotal = maxTotal;
        }
    }

    public void setMaxIdle(Integer maxIdle) {
        if (maxIdle != null) {
            if (maxIdle < 0) {
                throw new IllegalArgumentException("maxIdle should not be negative.");
            }
            this.maxIdle = maxIdle;
        }
    }

    public void setMinIdle(Integer minIdle) {
        if (minIdle != null) {
            if (minIdle < 0) {
                throw new IllegalArgumentException("minIdle should not be negative.");
            }
            this.minIdle = minIdle;
        }
    }
}