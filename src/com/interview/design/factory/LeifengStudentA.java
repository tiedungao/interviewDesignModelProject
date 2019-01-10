package com.interview.design.factory;

public class LeifengStudentA extends LeiFeng {

    @Override
    public void clean() {
        System.out.println("雷锋同学A打扫卫生");
    }

    public void bath() {
        System.out.println("雷锋同学A洗澡");
    }

    @Override
    public void cook() {
        System.out.println("雷锋同学A做饭");
    }
}
