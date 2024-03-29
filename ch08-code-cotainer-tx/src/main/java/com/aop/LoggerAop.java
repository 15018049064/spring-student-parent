package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class LoggerAop {

    @Pointcut("execution(* com.service..*.*(..))")
    public void myPointcut() {

    }

    @Before("myPointcut()")
    public void before() {
        System.out.println("before----------");
    }
}
