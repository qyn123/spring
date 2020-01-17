package com.qiaoyn.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 使用注解方式实现aop
 * @author qiaoyn
 **/
@Aspect//标注这个类是一个切面
public class TestAnnotation {

    @Before("execution(* com.qiaoyn.aop.Service.Impl.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }
    @After("execution(* com.qiaoyn.aop.Service.Impl.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后");
    }


    //在环绕增强中，给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.qiaoyn.aop.Service.Impl.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        //获得签名
        System.out.println(proceedingJoinPoint.getSignature());
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println(proceed);
        System.out.println("环绕后");
        //环绕前-方法执行前-环绕后-方法执行后
    }
}
