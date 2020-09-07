package com.cus.design.factory;

import com.cus.design.factory.factoryMethod.AbstractFactory;
import com.cus.design.factory.factoryMethod.JavaVideoFactory;
import com.cus.design.factory.simpleFactory.Video;
import org.junit.jupiter.api.Test;

/**
 * @author zhaojiejun
 * @date 2020/9/7 9:12 下午
 **/
public class FactoryMethodTest {
    @Test
    public void testFactoryMethod(){
        AbstractFactory javaVideoFactory = new JavaVideoFactory();
        Video javaVideo = javaVideoFactory.getVideo();
        javaVideo.play();
    }
}
