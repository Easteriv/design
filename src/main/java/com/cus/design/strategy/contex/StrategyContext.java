package com.cus.design.strategy.contex;

import com.cus.design.strategy.service.OperatorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhaojiejun
 * @date 2020/7/23 10:19 下午
 **/
@Component
@Slf4j
public class StrategyContext {
    private final Map<String, OperatorService> strategyMap = new ConcurrentHashMap<String, OperatorService>();

    public String doMethod(String type) {
        try {
            return strategyMap.get(type).action();
        }
        catch (NullPointerException e){
            log.error("[StrategyContext][doMethod] no such type,please check");
            return "Error";
        }
    }

    @Autowired
    private StrategyContext(Map<String, OperatorService> map) {
        map.forEach(this.strategyMap::put);
    }
}
