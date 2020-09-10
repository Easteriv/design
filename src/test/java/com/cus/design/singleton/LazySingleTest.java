package com.cus.design.singleton;

import com.cus.design.singleton.lhs.LazySingleton;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

/**
 * @author zhaojiejun
 * @date 2020/9/7 9:55 下午
 **/
public class LazySingleTest {

    /**
     * 模拟client_num个客户端同时访问
     */
    private static final int CLIENT_NUM = 1000;


    /**
     * 计数器
     */
    final static CountDownLatch doneSignal = new CountDownLatch(CLIENT_NUM);

    @Test
    @DisplayName("测试懒汉式")
    public void testLazySingleton(){
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10,3600L,
                TimeUnit.MINUTES, new ArrayBlockingQueue<>(2000),new ThreadPoolExecutor.AbortPolicy());

        for (int i=0 ; i< CLIENT_NUM; i++){
            threadPoolExecutor.execute(()->{
                try {
                    doneSignal.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(LazySingleton.getInstance()+"=");
            });
            doneSignal.countDown();
        }

        System.out.println("end");
    }
}
