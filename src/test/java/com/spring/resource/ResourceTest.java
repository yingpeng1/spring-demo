package com.spring.resource;

import com.spring.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.IOException;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class ResourceTest extends UnitTestBase {

    public ResourceTest(){
        super("classpath:spring-resource.xml");
    }

    @Test
    public void testResource(){
        Resource resource = super.getBean("resource");
        try {
            resource.resource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}