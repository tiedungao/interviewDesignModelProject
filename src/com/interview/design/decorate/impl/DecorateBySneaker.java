package com.interview.design.decorate.impl;

import com.interview.design.decorate.Decorate;

public class DecorateBySneaker extends Decorate {

    private String Style = "sneaker";

    @Override
    public void show() {
        System.out.println("戴领带");
        super.show();
    }
}
