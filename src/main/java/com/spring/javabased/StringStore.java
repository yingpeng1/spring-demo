package com.spring.javabased;

public class StringStore implements Store<String> {

    @Override
    public void init(){
        System.out.println("This is init.");
    }

    @Override
    public void destroy(){
        System.out.println("This is destroy.");
    }
}
