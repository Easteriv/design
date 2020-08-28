package com.cus.design.handler;

import org.junit.jupiter.api.Test;

/**
 * @author zhaojiejun
 * @date 2020/8/15 11:39 上午
 **/
public class HandlerTest {

    @Test
    public void testHandler() {
        Article article = new Article();
        String articleData = "我爱黄色,我爱广告";
        article.setData(articleData);
        ADHandler ADHandler = new ADHandler();
        PornHandler pornHandler = new PornHandler();
        ADHandler.setSuccessor(pornHandler);
        ADHandler.doHandler(article);
        System.out.println(article.getData());
    }
}
