package com.len.springcloud.demo.servercaller.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.AjAttribute;
import org.aspectj.weaver.patterns.PerClause;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName RedisAspect
 * @Description RedisAspect
 * @Author liyong
 * @Date 2020/7/27 17:00
 * @Version 1.0
 */
@Aspect
@Component
public class RedisAspect {

    private final static Logger logger = LoggerFactory.getLogger(RedisAspect.class);

    /**
     * 定义切入点，使用了 @RedisCache 的方法
     */
    @Pointcut("@annotation(com.len.springcloud.demo.servercaller.annotation.Hello)")
    public void redisCachePoint()
    {
    }

    @Pointcut("@annotation(com.len.springcloud.demo.servercaller.annotation.Hello)")
    public void redisEvictPoint()
    {
    }
}
