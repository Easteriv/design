package com.cus.design.factory;

import com.cus.design.factory.simpleFactory.JavaVideo;
import com.cus.design.factory.simpleFactory.PythonVideo;
import com.cus.design.factory.simpleFactory.Video;
import com.cus.design.factory.simpleFactory.VideoFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * @author zhaojiejun
 * @date 2020/9/1 10:39 下午
 **/
@Slf4j
public class SimpleFactoryTest {
    @Test
    @DisplayName("普通工厂模式")
    public void testCreateVideo() {
        Video javaVideo = VideoFactory.createVideo("java");
        Optional.ofNullable(javaVideo).ifPresent(Video::play);
        Video pythonVideo = VideoFactory.createVideo("python");
        Optional.ofNullable(pythonVideo).ifPresent(Video::play);
    }

    @Test
    @DisplayName("普通工厂模式反射创建")
    public void testCreateVideoByClass(){
        Video javaVideo = VideoFactory.createVideo(JavaVideo.class);
        Optional.ofNullable(javaVideo).ifPresent(Video::play);
        Video pythonVideo = VideoFactory.createVideo(PythonVideo.class);
        Optional.ofNullable(pythonVideo).ifPresent(Video::play);
    }
}
