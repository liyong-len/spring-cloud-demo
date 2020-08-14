package com.len.demo.designpatterns.single;

/**
 * @ClassName singleDemoTest
 * @Description singleDemoTest
 * @Author liyong
 * @Date 2020/8/14 15:00
 * @Version 1.0
 */
public class singleDemoTest {

    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();
    }
}
