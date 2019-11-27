package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {

    //切点表达式
    @Pointcut("execution(public * com.service..*.*(..))")
    public void myPrintCut() {

    }

    //前置通知
    @Before("myPrintCut()")
    public void before() {
        System.out.println("before======");
    }

    //后置通知
    @After("myPrintCut()")
    public void after() {
        System.out.println("after-------");
    }

    @AfterReturning(pointcut = "myPrintCut()",returning = "count")
    public void afterReturning(int count) {
        System.out.println("afterReturning--" + count);
    }

    @AfterThrowing(pointcut = "myPrintCut()",throwing = "re")
    public void afterThrowing(RuntimeException re) {
        System.out.println("afterThrowing---" + re);
    }

    @Around("myPrintCut()")
    public Object around(ProceedingJoinPoint joinPoint) {
        Object object = null;
        try {
            System.out.println("around---");
            object = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return object;
    }

}
