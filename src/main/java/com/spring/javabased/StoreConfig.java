package com.spring.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {

    /*@Value("${url}")
    private String url;

    @Value("${jdbc.username}")
    private String userName;

    @Value("${password}")
    private String password;

    @Bean
    public MyDriverManager myDriverManager(){
        return new MyDriverManager(url,userName,password);
    }*/

    /*@Bean(name = "store",initMethod = "init",destroyMethod = "destroy")
    @Scope(value = "prototype")
    public Store stringStore(){
        return new StringStore();
    }*/

    @Autowired
    @Qualifier("stringStore")
    private Store<String> s1;

    @Autowired
    @Qualifier("intergerStore")
    private Store<Integer> s2;

    @Bean
    public StringStore stringStore(){
        return new StringStore();
    }

    @Bean
    public IntergerStore intergerStore(){
        return new IntergerStore();
    }

    @Bean(name = "stringStoreTest")
    public Store stringStoreTest(){
        System.out.println("s1: " + s1.getClass().getName());
        System.out.println("s2: " + s2.getClass().getName());
        return new StringStore();
    }
}
