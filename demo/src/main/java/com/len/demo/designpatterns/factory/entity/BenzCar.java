package com.len.demo.designpatterns.factory.entity;

import com.len.demo.designpatterns.factory.inter.CarShop;
import lombok.Data;

/**
 * @ClassName BenzCar
 * @Description BenzCar
 * @Author liyong
 * @Date 2020/8/14 13:46
 * @Version 1.0
 */
@Data
public class BenzCar extends Car implements CarShop {

    private String mode;

    public BenzCar() {
        this.getCat();
    }

    /**
     * 获取车辆
     *
     * @return
     */
    @Override
    public Car getCat() {
        System.out.println("生产了奔驰");
        return this;
    }
}
