package com.spring.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MoocAspect {

    public void before(){
        System.out.println("MoocAspect before.");
    }

    public void afterReturning(){
        System.out.println("MoocAspect afterReturning.");
    }

    public void afterThrowing(){
        System.out.println("MoocAspect afterThrowing.");
    }

    public void after(){
        System.out.println("MoocAspect after.");
    }

    public Object aroundInit(ProceedingJoinPoint pjp,String bizName,int times){
        System.out.println(bizName + " " + times);
        Object obj = null;
        try {
            System.out.println("MoocAspect aroundInit1.");
             obj = pjp.proceed();
            System.out.println("MoocAspect aroundInit2.");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return obj;
    }
}
