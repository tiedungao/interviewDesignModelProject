package com.interview.design.factory.abstractFactory.factory.impl;

import com.interview.design.factory.abstractFactory.factory.Factory;
import com.interview.design.factory.abstractFactory.product.car.Car;
import com.interview.design.factory.abstractFactory.product.car.Trucks;
import com.interview.design.factory.abstractFactory.product.insurance.Insurance;
import com.interview.design.factory.abstractFactory.product.insurance.PingAnInsurance;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 0:41 2019/1/13
 */
public class TrucksFactory implements Factory {
    @Override
    public Car createCar() {
        return new Trucks();        //Truck
    }

    @Override
    public Insurance attachInsurance() {
        return new PingAnInsurance();   //平安
    }
}
