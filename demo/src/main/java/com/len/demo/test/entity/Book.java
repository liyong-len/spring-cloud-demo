package com.len.demo.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName person
 * @Description person
 * @Author liyong
 * @Date 2020/8/12 09:15
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class Book {
    private String name;
    private int price;
}
