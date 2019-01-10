package com.interview.design.decorate.impl;

import com.interview.design.decorate.Decorate;

public class DecorateByShoes extends Decorate {

    private String Style = "shoes";

    @Override
    public void show() {
        System.out.println("穿鞋子");
        super.show();
    }

}
