package com.cus.design.flyweight;

import com.cus.design.flyweigth.Car;
import com.cus.design.flyweigth.CarFactory;
import org.junit.jupiter.api.Test;

/**
 * @author zhaojiejun
 * @date 2020/10/6 10:37 上午
 **/
public class FlyWeightTest {
    @Test
    void testGetCar() {
        String[] colors = new String[]{"red", "blue", "green", "black", "white"};
        for (int i = 0; i < 100; i++) {
            int index = (int) (Math.random() * colors.length);
            Car car = CarFactory.getInstance().getCar(colors[index]);
            System.out.println(car);
        }
    }

    @Test
    void testGetCarWithoutFlyWeight() {
        String[] colors = new String[]{"red", "blue", "green", "black", "white"};
        for (int i = 0; i < 100; i++) {
            int index = (int) (Math.random() * colors.length);
            Car car = new Car();
            car.setColor(colors[index]);
            System.out.println(car);
        }
    }
}
