package com.cus.design.factory.factoryMethod;

import com.cus.design.factory.simpleFactory.PythonVideo;
import com.cus.design.factory.simpleFactory.Video;

/**
 * @author zhaojiejun
 * @date 2020/9/7 9:12 下午
 **/
public class PythonVideoFactory extends AbstractFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
