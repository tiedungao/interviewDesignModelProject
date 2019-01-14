package com.interview.design.factory.abstractFactory.product.insurance;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 0:39 2019/1/13
 */
public class PingAnInsurance extends Insurance {

    @Override
    public void print() {
        System.out.println("您的爱车已经投保平安保险");
    }
}
