package com.interview.design.factory;

public class LeifengStudentB extends LeiFeng {

    @Override
    public void clean() {
        System.out.println("雷锋同学B打扫卫生");
    }

    public void bath() {
        System.out.println("雷锋同学B洗澡");
    }

    @Override
    public void cook() {
        System.out.println("雷锋同学B做饭");
    }
}
