package com.len.demo.designpatterns.abstractfactory;

import com.len.demo.designpatterns.factory.entity.*;

/**
 * @ClassName CarFactory
 * @Description CarFactory
 * @Author liyong
 * @Date 2020/8/14 14:30
 * @Version 1.0
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        switch (color) {
            case "red":
                return new Red();
            case "green":
                return new Green();
            case "blue":
                return new Blue();
            default:
                return null;
        }
    }

    @Override
    public Car getCarByBrand(String type) {
        return null;
    }
}
