package com.interview.design.decorate;

public class Person {

    public Person() {

    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("执行装饰器");
    }

}
