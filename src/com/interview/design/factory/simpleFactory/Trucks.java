package com.interview.design.factory.simpleFactory;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 21:04 2019/1/11
 */
public class Trucks extends Car {

    public Trucks(String name){
        super.name = name;
    }

    @Override
    public void drive() {
        System.out.println("我驾驶这一辆"+this.name+"出发了");
    }
}
