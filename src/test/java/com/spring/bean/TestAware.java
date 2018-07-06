package com.spring.bean;

import com.spring.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {

    public TestAware(){
        super("classpath:spring-aware.xml");
    }

    @Test
    public void testApplicationContext(){
        System.out.println("testApplicationContext: " + super.getBean(
                "applicationContext").hashCode());
    }

    @Test
    public void testBeanName(){
        System.out.println("testBeanName: " + super.getBean("beanName").hashCode());
    }
}
