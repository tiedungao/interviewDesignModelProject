package com.interview.design.factory.abstractFactory.product.car;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 0:35 2019/1/13
 */
public class Trucks extends Car {

    @Override
    public void drive() {
        System.out.println("欢迎购买一辆Trucks");
    }
}
