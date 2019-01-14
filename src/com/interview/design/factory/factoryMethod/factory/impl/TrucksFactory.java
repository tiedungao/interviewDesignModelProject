package com.interview.design.factory.factoryMethod.factory.impl;

import com.interview.design.factory.factoryMethod.factory.CarFactory;
import com.interview.design.factory.factoryMethod.product.Car;
import com.interview.design.factory.factoryMethod.product.Trucks;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 20:35 2019/1/12
 */
public class TrucksFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Trucks("trucks");
    }

}
