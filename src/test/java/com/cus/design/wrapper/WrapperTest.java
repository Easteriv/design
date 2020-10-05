package com.cus.design.wrapper;

import com.cus.design.wrapper.map.AbstractMap;
import com.cus.design.wrapper.map.MyHashMap;
import com.cus.design.wrapper.map.MyWrapperMap;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Map;

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

    @Test
    void testMapWrapper() {
        AbstractMap abstractMap = new MyHashMap();
        MyWrapperMap myWrapperMap = new MyWrapperMap(abstractMap);
        Map<String, String> put = myWrapperMap.put("test", "test");
        System.out.println(put);
    }
}
