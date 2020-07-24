package com.cus.design.strategy.controller;

import com.cus.design.strategy.contex.StrategyContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 自定义策略模式controller
 * @author zhaojiejun
 * @date 2020/7/23 10:28 下午
 **/
@RestController
@RequestMapping("/strategy")
public class StrategyController {

    private final StrategyContext strategyContext;

    public StrategyController(StrategyContext strategyContext) {
        this.strategyContext = strategyContext;
    }

    /**
     * 手动选择策略模式
     * @author zhaojiejun
     * @param type 策略类型
     * @return java.lang.String
     **/
    @GetMapping("getType")
    public String getType(@RequestParam(value = "type") String type) {
        return strategyContext.doMethod(type);
    }
}
