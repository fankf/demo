package com.fan.cap9.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author fan
 * @create 2019-10-23 21:38
 * @description
 * @see
 */
@Aspect
public class CalAspect {
    @Pointcut("execution(public int com.fan.cap9.bean.Calculate.*(..))")
    public void pointCut(){

    }
    @Before("pointCut()")
    public void before(){
        System.out.println("before ...");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("after ...");
    }

    @AfterReturning("pointCut()")
    public void AfterReturning(){
        System.out.println("AfterReturning ...");
    }

    @AfterThrowing("pointCut()")
    public void AfterThrowing(){
        System.out.println("AfterThrowing ...");
    }

    @Around("pointCut()")
    public int Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around proceed before...");
        int k = (int) proceedingJoinPoint.proceed();
        System.out.println("Around proceed after...");
        return k;
    }
}
