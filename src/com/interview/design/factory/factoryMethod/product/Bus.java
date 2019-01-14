package com.interview.design.factory.factoryMethod.product;


/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 21:06 2019/1/11
 */
public class Bus extends Car {

    public Bus(String name){
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println("我驾驶这一辆"+this.name+"出发了");
    }
}
