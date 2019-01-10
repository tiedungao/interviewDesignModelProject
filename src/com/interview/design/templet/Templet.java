package com.interview.design.templet;

public abstract class Templet {

    public void question1() {
        System.out.println("啦啦啦啦啦啦~~~1");
        System.out.println("result:" + answer1());
    }

    public void question2() {
        System.out.println("啦啦啦啦啦啦~~~2");
        System.out.println("result:" + answer2());
    }

    public void question3() {
        System.out.println("啦啦啦啦啦啦~~~3");
        System.out.println("result:" + answer3());
    }

    protected abstract String answer1();

    protected abstract String answer2();

    protected abstract String answer3();

}
