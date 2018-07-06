package com.spring;

import com.spring.aop.aspectj.biz.MoocBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAspectj extends UnitTestBase{

    public TestAspectj(){
        super("classpath:spring-aop-aspectj.xml");
    }

    @Test
    public void test(){
        MoocBiz biz = getBean("moocBiz");
        biz.save("This is test.");
    }
}
