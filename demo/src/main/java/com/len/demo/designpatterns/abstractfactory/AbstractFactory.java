package com.len.demo.designpatterns.abstractfactory;

import com.len.demo.designpatterns.factory.entity.Car;
import com.len.demo.designpatterns.factory.entity.Color;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Car getCarByBrand(String brand);
}
