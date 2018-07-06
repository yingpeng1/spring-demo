package com.spring;

import com.spring.jsr.JsrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJsr extends UnitTestBase{

    public TestJsr(){
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void testSave(){
        JsrService service = getBean("jsrService");
        service.save();
    }
}
