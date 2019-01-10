package com.interview.design.decorate.impl;

import com.interview.design.decorate.Decorate;

public class DecorateByPants extends Decorate {

    private String Style = "pants";

    @Override
    public void show() {
        System.out.println("穿裤子");
        super.show();
    }
}
