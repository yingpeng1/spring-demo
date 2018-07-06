package com.spring.beanannotation;

import com.spring.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class BeanAnnotationTest extends UnitTestBase {

    public BeanAnnotationTest(){
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void say() {
        BeanAnnotation beanAnnotation = super.getBean("bean");
        beanAnnotation.myHashCode();

        BeanAnnotation beanAnnotation1 = super.getBean("bean");
        beanAnnotation1.myHashCode();
    }
}