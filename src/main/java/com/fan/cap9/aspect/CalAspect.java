package com.fan.cap9.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @author fan
 * @create 2019-10-23 21:38
 * @description
 * @see
 */
@Aspect
public class CalAspect {
    @Pointcut("execution(public int com.fan.cap9.bean.Calculate.*(..))")
    public void pointCut() {

    }

    @Before(value = "pointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName()+"before ..."+ Arrays.asList(joinPoint.getArgs()));
    }

    @After("pointCut()")
    public void after(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName()+"before ..."+ Arrays.asList(joinPoint.getArgs()));
    }

    @AfterReturning(value = "pointCut()", returning ="result")
    public void AfterReturning(String result) {
        System.out.println("AfterReturning ..."+result);
    }

    @AfterThrowing(value = "pointCut()", throwing = "e")
    public void AfterThrowing(Exception e) {
        System.out.println("AfterThrowing ...异常原因：" + e);
    }

//    @Around("pointCut()")
//    public int Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("Around proceed before...");
//        int k = (int) proceedingJoinPoint.proceed();
//        System.out.println("Around proceed after...");
//        return k;
//    }
}
