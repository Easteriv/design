package com.cus.design.handler;

import java.util.Optional;

/**
 * 色情处理器
 *
 * @author zhaojiejun
 * @date 2020/8/28 12:03 上午
 **/
public class PornHandler extends AbstractHandler {
    private final String keyWord = "黄色";

    @Override
    public void doHandler(Article article) {
        String data = article.getData();
        Optional.ofNullable(data).ifPresent(s -> {
            String replace = s.replace(keyWord, "**");
            article.setData(replace);
        });
        next(article);
    }
}
