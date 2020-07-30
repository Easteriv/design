package com.cus.design.strategy.sample;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 自定义拒绝策略
 * @author zhaojiejun
 * @date 2020/7/27 10:55 下午
 **/
@Slf4j
public class MyIgnorePolicy implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        doLog(r, executor);
    }

    private void doLog(Runnable r, ThreadPoolExecutor e) {
        // 可做日志记录等
        log.error("{}rejected",r.toString());
    }
}
