package com.spring;

import com.spring.multibean.BeanInvoker;
import com.spring.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase{

    public TestInjection(){
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void testAutowired(){
        InjectionService injectionService = super.getBean("injectionServiceImpl");
        injectionService.save("This is autowired.");
    }

    @Test
    public void testBeanInvoker(){
        BeanInvoker beanInvoker = super.getBean("beanInvoker");
        beanInvoker.say();
    }

}
