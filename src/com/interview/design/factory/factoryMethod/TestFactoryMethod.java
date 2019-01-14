package com.interview.design.factory.factoryMethod;

import com.interview.design.factory.factoryMethod.factory.CarFactory;
import com.interview.design.factory.factoryMethod.factory.impl.BusFactory;
import com.interview.design.factory.factoryMethod.factory.impl.TrucksFactory;
import com.interview.design.factory.factoryMethod.product.Car;
import com.interview.design.factory.factoryMethod.product.Trucks;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 21:56 2019/1/12
 */
public class TestFactoryMethod {

    public static void main(String[] args) {
        CarFactory factory;

        factory = new BusFactory();
        Car bus = factory.createCar();
        bus.drive();

        factory = new TrucksFactory();
        Car trucks = factory.createCar();
        trucks.drive();

    }

}
