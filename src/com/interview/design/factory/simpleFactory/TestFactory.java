package com.interview.design.factory.simpleFactory;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 21:12 2019/1/11
 */
public class TestFactory {

    public static void main(String[] args) {
        Car car = CarFactory.createCar("bus");
        car.drive();
    }

}
