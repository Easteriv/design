package com.cus.design.wrapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author zhaojiejun
 * @date 2020/8/3 9:45 下午
 **/
@Slf4j
public class WrapperTest {
    @Test
    void testEggWrapper() {
        //普通饼
        AbstractCookie abstractCookie = new Pancakes();
        //加个鸡蛋
        EggPancakes eggPancakes = new EggPancakes(abstractCookie);
        log.info("名称：{},价格:{}",eggPancakes.getDesc(),eggPancakes.cost());
        //加了根香肠
        SausagePancakes sausagePancakes = new SausagePancakes(eggPancakes);
        log.info("名称：{},价格:{}",sausagePancakes.getDesc(),sausagePancakes.cost());
    }
}
