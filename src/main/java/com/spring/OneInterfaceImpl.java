package com.spring;

public class OneInterfaceImpl implements OneInterface {
    @Override
    public String hello(String word) {
        return "Word from interface \"OneInterface\" : " + word;
    }
}
