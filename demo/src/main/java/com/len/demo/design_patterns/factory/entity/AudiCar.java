package com.len.demo.design_patterns.factory.entity;

import com.len.demo.design_patterns.factory.inter.CarShop;
import lombok.Data;

/**
 * @ClassName BenzCar
 * @Description BenzCar
 * @Author liyong
 * @Date 2020/8/14 13:46
 * @Version 1.0
 */
@Data
public class AudiCar extends Car implements CarShop {

    private String engine;

    public AudiCar() {
        this.getCat();
    }

    /**
     * 获取车辆
     *
     * @return
     */
    @Override
    public Car getCat() {
        System.out.println("生产了奥迪");
        return this;
    }

}
