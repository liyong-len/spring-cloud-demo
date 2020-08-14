package com.len.demo.designpatterns.factory.inter;

import com.len.demo.designpatterns.factory.entity.Car;

/**
 * @ClassName CarShop
 * @Description CarShop
 * @Author liyong
 * @Date 2020/8/14 13:50
 * @Version 1.0
 */
public interface CarShop {

    /**
     * 获取车辆
     *
     * @return
     */
    Car getCat();
}
