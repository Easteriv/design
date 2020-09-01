package com.cus.design.factory.simpleFactory;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zhaojiejun
 * @date 2020/9/1 10:33 下午
 **/
public class JavaVideo extends Video{
    @Override
    public void play() {
        System.out.println("正在播放java视频");
    }
}
