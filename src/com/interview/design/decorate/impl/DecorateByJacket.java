package com.interview.design.decorate.impl;

import com.interview.design.decorate.Decorate;

public class DecorateByJacket extends Decorate {

    private String Style = "jacket";

    @Override
    public void show() {
        System.out.println("穿上衣");
        super.show();
    }

}
