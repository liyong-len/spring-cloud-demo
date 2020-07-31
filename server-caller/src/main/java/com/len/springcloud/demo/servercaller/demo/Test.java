package com.len.springcloud.demo.servercaller.demo;

import com.len.springcloud.demo.servercaller.annotation.Hello;

import java.lang.reflect.Method;

/**
 * @ClassName Test
 * @Description Test
 * @Author liyong
 * @Date 2020/7/27 16:55
 * @Version 1.0
 */
public class Test {

    public Test(){

    }

    @Hello(value = "amao")
    public static void main(String[] args) throws NoSuchMethodException {
        Test test=new Test();
        Class<Test> aClass = (Class<Test>) test.getClass();
        Method method = aClass.getMethod("test", String[].class);
        Hello annotation = method.getAnnotation(Hello.class);
        System.out.println(annotation.value());
    }
    @Hello(value = "agou")
    public void test (int i){

    }
}
