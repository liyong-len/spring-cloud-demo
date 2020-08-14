package com.len.demo.designpatterns.abstractfactory;

import com.len.demo.designpatterns.factory.entity.Car;

/**
 * @ClassName AbstractFactoryTest
 * @Description AbstractFactoryTest
 * @Author liyong
 * @Date 2020/8/14 14:36
 * @Version 1.0
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory factoryProducer = FactoryProducer.getFactory("car");
        Car bmw = factoryProducer.getCarByBrand("bmw");
    }
}
