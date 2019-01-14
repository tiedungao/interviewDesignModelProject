package com.interview.design.factory.abstractFactory.factory.impl;

import com.interview.design.factory.abstractFactory.factory.Factory;
import com.interview.design.factory.abstractFactory.product.car.Bus;
import com.interview.design.factory.abstractFactory.product.car.Car;
import com.interview.design.factory.abstractFactory.product.insurance.Insurance;
import com.interview.design.factory.abstractFactory.product.insurance.LifeInsurance;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 0:28 2019/1/13
 */
public class BusFactory implements Factory {

    @Override
    public Car createCar() {
        return new Bus();               //Bus
    }

    @Override
    public Insurance attachInsurance() {
        return new LifeInsurance();     //人寿
    }
}
