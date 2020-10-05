package com.cus.design.adapter.powerAdapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 220v交流电
 *
 * @author zhaojiejun
 * @date 2020/10/5 8:35 上午
 **/
@Slf4j
public class Ac220 {
    public int outPut() {
        int outPut = 220;
        log.info("输出交流电:{}v", outPut);
        return outPut;
    }
}
