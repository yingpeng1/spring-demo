package com.spring.aop.schema.advisors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;
import org.springframework.dao.PessimisticLockingFailureException;

public class ConcurrentOperationExecutor implements Ordered {

    private static final int DEFAULT_MAX_RETRIES = 2;

    private int maxRetries = DEFAULT_MAX_RETRIES;

    private int order = 1;

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public int getOrder() {
        return 0;
    }

    public Object doConcurrentOperation(ProceedingJoinPoint pjp) throws Throwable{
        int numAttempts = 0;
        PessimisticLockingFailureException lockingFailureException;
        do{
            numAttempts++;
            System.out.println("Try times : " + numAttempts);
            try {
                return pjp.proceed();
            } catch (PessimisticLockingFailureException ex){
                lockingFailureException = ex;
            }
        }while (numAttempts <= this.maxRetries);
        System.out.println("Try error : " + numAttempts);
        throw lockingFailureException;
    }
}
