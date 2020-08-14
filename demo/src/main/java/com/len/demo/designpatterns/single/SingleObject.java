package com.len.demo.designpatterns.single;

/**
 * @ClassName SingleObject
 * @Description SingleObject
 * @Author liyong
 * @Date 2020/8/14 14:58
 * @Version 1.0
 */
public class SingleObject {

    public static SingleObject singleObject;

    private SingleObject() {

    }

    /**
     * 双检锁/双重校验锁 DCL，即 double-checked locking）
     * <p>
     * 是否 Lazy 初始化：是
     * 是否多线程安全：是
     */
    public static SingleObject getInstance() {
        if (null == singleObject) {
            synchronized (SingleObject.class) {
                if (null == singleObject) {
                    return new SingleObject();
                }
            }
        }
        return singleObject;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
