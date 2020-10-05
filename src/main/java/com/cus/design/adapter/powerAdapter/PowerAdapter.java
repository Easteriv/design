package com.cus.design.adapter.powerAdapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 电源适配器，组合220V交流电生成5V直流电
 * @author zhaojiejun
 * @date 2020/10/5 8:43 上午
 **/
@Slf4j
public class PowerAdapter implements Dc5{
    private Ac220 ac220 = new Ac220();

    @Override
    public Integer outPutDc5() {
        int intPut = ac220.outPut();
        int outPut = intPut / 44;
        log.info("输出直流电:{}",outPut);
        return outPut;
    }
}
