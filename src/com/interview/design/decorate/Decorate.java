package com.interview.design.decorate;

public class Decorate extends Person {

    Person decorate;

    public void setDecorate(Person decorate) {
        this.decorate = decorate;
    }

    @Override
    public void show() {
        if (null != decorate) {
            decorate.show();
        }
    }

}
