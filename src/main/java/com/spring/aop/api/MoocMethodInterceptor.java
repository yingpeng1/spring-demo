package com.spring.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MoocMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("MoocMethodInterceptor 1 : " + methodInvocation.getMethod().getName()
        + " " + methodInvocation.getStaticPart().getClass().getName());
        Object obj = methodInvocation.proceed();
        System.out.println("MoocMethodInterceptor 2 : " + obj);
        return obj;
    }
}
