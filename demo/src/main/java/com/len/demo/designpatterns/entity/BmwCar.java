package com.len.demo.designpatterns.entity;

import lombok.Data;

/**
 * @ClassName BenzCar
 * @Description BenzCar
 * @Author liyong
 * @Date 2020/8/14 13:46
 * @Version 1.0
 */
@Data
public class BmwCar extends Car implements CarShop {

    private String driver;

    public BmwCar() {
        this.getCat();
    }

    /**
     * 获取车辆
     *
     * @return
     */
    @Override
    public Car getCat() {
        System.out.println("生产了宝马");
        return this;
    }
}
