package com.cus.design.strategy.service.impl;

import com.cus.design.strategy.service.OperatorService;
import org.springframework.stereotype.Service;

/**
 * @author zhaojiejun
 * @date 2020/7/23 10:18 下午
 **/
@Service("del")
public class OperationDelServiceImpl implements OperatorService {
    @Override
    public String action() {
        return "OperationDelServiceImpl";
    }
}
