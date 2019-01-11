package com.interview.design.proxy.cglib;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 11:11 2019/1/11
 */
public class Parent {

    public static void main(String[] args) {

        System.out.println("我们是小明的父母，请劝一下孩子，让他好好学习吧");

        Child child = new Child();

        StudyProxyFactory studyProxyFactory = new StudyProxyFactory();

        Child proxy = (Child) studyProxyFactory.getInstance(child);

        proxy.study();

    }


}
