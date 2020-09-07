package com.cus.design.factory.factoryMethod;

import com.cus.design.factory.simpleFactory.JavaVideo;
import com.cus.design.factory.simpleFactory.Video;

/**
 * @author zhaojiejun
 * @date 2020/9/7 9:11 下午
 **/
public class JavaVideoFactory extends AbstractFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
