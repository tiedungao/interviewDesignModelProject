package com.interview.design.builder;

public class CreatePeopleA extends Builder {

    Product product = new Product();

    @Override
    public void createHands() {
        product.add("使用创建人类A创建手臂");
    }

    @Override
    public void createFoot() {
        product.add("使用创建人类A创建双腿");
    }

    @Override
    public Product getPeople() {
        return product;
    }
}
