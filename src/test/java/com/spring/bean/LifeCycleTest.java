package com.spring.bean;

import com.spring.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class LifeCycleTest extends UnitTestBase {

    public LifeCycleTest(){
        super("classpath:spring-lifecycle.xml");
    }

    @Test
    public void test1(){
        super.getBean("lifeCycle");
    }

}