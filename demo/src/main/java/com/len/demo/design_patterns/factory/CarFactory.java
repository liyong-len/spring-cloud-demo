package com.len.demo.design_patterns.factory;

import com.len.demo.design_patterns.factory.entity.AudiCar;
import com.len.demo.design_patterns.factory.entity.BenzCar;
import com.len.demo.design_patterns.factory.entity.BmwCar;
import com.len.demo.design_patterns.factory.entity.Car;

/**
 * 车辆工厂类
 *
 * @ClassName CarFactory
 * @Description CarFactory
 * @Author liyong
 * @Date 2020/8/14 13:49
 * @Version 1.0
 */
public class CarFactory {

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
