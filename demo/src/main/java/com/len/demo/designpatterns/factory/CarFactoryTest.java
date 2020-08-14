package com.len.demo.designpatterns.factory;

import com.len.demo.designpatterns.factory.entity.Car;

/**
 * @ClassName CarFactoryTest
 * @Description CarFactoryTest
 * @Author liyong
 * @Date 2020/8/14 13:57
 * @Version 1.0
 */
public class CarFactoryTest {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car audi = factory.getCarByBrand("bmw");
    }
}