package com.interview.design.factory.factoryMethod.product;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 21:07 2019/1/11
 */
public class Sedan extends Car {

    public Sedan(String name){
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println("我驾驶这一辆"+this.name+"出发了");
    }
}
