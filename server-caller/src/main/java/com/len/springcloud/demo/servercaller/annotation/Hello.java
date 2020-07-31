package com.len.springcloud.demo.servercaller.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName Hello
 * @Description Hello
 * @Author liyong
 * @Date 2020/7/27 16:51
 * @Version 1.0
 */
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Hello {
    String value();
}
