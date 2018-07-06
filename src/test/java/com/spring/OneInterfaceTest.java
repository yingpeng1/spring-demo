package com.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class OneInterfaceTest extends UnitTestBase{

    public OneInterfaceTest(){
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void hello() {
        OneInterface oneInterface = super.getBean("oneInterface");
        System.out.println(oneInterface.hello("我的输入参数"));
    }
}