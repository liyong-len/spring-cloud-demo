package com.len.demo.designpatterns.abstractfactory;

import com.len.demo.designpatterns.factory.entity.*;

/**
 * @ClassName CarFactory
 * @Description CarFactory
 * @Author liyong
 * @Date 2020/8/14 14:30
 * @Version 1.0
 */
public class CarFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Car getCarByBrand(String type) {
        switch (type) {
            case "audi":
                return new AudiCar();
            case "bmw":
                return new BmwCar();
            case "benz":
                return new BenzCar();
            default:
                return new Car();
        }
    }
}
