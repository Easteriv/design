package com.cus.design.handler;

import java.util.Optional;

/**
 * 广告处理器
 * @author zhaojiejun
 * @date 2020/8/27 11:58 下午
 **/
public class ADHandler extends AbstractHandler {
    private static final String KEY_WORD = "广告";
    @Override
    public void doHandler(Article article) {
        String data = article.getData();
        Optional.ofNullable(data).ifPresent(s->{
            String replace = s.replace(KEY_WORD, "**");
            article.setData(replace);
        });
        next(article);
    }
}
