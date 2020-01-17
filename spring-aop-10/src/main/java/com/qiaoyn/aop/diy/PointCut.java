package com.qiaoyn.aop.diy;

/**
 * @author qiaoyn
 * 自定义切入点
 **/
public class PointCut {

    public void before(){
        System.out.println("方法执行前");
    }

    public void after(){
        System.out.println("方法执行后");
    }
}
