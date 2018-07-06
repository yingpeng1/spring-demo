package com.spring;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> name = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(name, (a, b) -> b.compareTo(a));
        System.out.println(name.toString());
    }
}
