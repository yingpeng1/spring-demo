package com.spring.jsr;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Named;

@Named
public class JsrService {

    @Resource
    private JsrDAO jsrDAO;

    public void setJsrDAO(JsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }

    @PostConstruct
    public void init(){
        System.out.println("jsrService init.");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jsrService destroy.");
    }

    public void save(){
        jsrDAO.save();
    }
}
