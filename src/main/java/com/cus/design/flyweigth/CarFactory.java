package com.cus.design.flyweigth;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhaojiejun
 * @date 2020/10/6 10:27 上午
 **/
@Slf4j
public class CarFactory {
    private static final CarFactory INSTANCE = new CarFactory();
    private static final Map<String, Car> CAR_MAP = new ConcurrentHashMap<>();

    private CarFactory() {
    }

    public static CarFactory getInstance() {
        return INSTANCE;
    }

    public Car getCar(String color) {
        if (StringUtils.isNotBlank(color)) {
            boolean isPresent = CAR_MAP.containsKey(color);
            if (!isPresent) {
                System.out.println("开始新建对象");
                Car car = new Car();
                car.setColor(color);
                CAR_MAP.put(color, car);
            }
            return CAR_MAP.get(color);
        } else {
            throw new IllegalArgumentException("the color can not empty");
        }
    }
}
