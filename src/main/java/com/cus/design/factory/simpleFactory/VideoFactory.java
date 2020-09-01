package com.cus.design.factory.simpleFactory;

import com.cus.design.Constant;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhaojiejun
 * @date 2020/9/1 10:35 下午
 **/
@Slf4j
public class VideoFactory {

    public static Video createVideo(String type) {
        if (Constant.JAVA.equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if (Constant.PYTHON.equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

    public static Video createVideo(Class<? extends Video> clazz) {
        String name = clazz.getName();
        return getInstanceByClassName(name);
    }

    private static Video getInstanceByClassName(String className) {
        try {
            return (Video) Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }
}