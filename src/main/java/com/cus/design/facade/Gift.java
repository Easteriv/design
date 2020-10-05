package com.cus.design.facade;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhaojiejun
 * @date 2020/10/5 11:27 上午
 **/
@Data
@Builder
public class Gift {
    /**
     * 礼物名称
     */
    private String name;
    /**
     * 礼物价格
     */
    private Double cost;
}
