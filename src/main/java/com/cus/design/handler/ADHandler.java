package com.cus.design.handler;

import java.util.Optional;

/**
 * 广告处理器
 * @author zhaojiejun
 * @date 2020/8/27 11:58 下午
 **/
public class ADHandler extends AbstractHandler {
    private final String keyWord = "广告";
    @Override
    public void doHandler(Article article) {
        String data = article.getData();
        Optional.ofNullable(data).ifPresent(s->{
            String replace = s.replace(keyWord, "**");
            article.setData(replace);
        });
        next(article);
    }
}
