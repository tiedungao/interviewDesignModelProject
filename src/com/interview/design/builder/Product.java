package com.interview.design.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    List<String> parts = new ArrayList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void getResult() {
        for (String part : parts) {
            System.out.println(part + "-");
        }
    }
}
