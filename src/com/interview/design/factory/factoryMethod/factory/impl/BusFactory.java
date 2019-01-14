package com.interview.design.factory.factoryMethod.factory.impl;

import com.interview.design.factory.factoryMethod.factory.CarFactory;
import com.interview.design.factory.factoryMethod.product.Bus;
import com.interview.design.factory.factoryMethod.product.Car;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 20:34 2019/1/12
 */
public class BusFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Bus("bus");
    }

}
