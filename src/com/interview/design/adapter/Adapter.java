package com.interview.design.adapter;

/**
 * @Auther: gaoti
 * @Date: 2018/10/23 17:06
 * @Description:
 */
public class Adapter extends Target {

    Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
