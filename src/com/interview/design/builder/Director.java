package com.interview.design.builder;

public class Director {

    public void construct(Builder builder) {
        builder.createHands();
        builder.createFoot();
    }

}
