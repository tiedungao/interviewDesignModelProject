package com.interview.design.builder;

public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builderA = new CreatePeopleA();
        Builder builderB = new CreatePeopleB();

        director.construct(builderA);
        Product product1 = builderA.getPeople();
        product1.getResult();

        director.construct(builderB);
        product1 = builderB.getPeople();
        product1.getResult();
    }

}
