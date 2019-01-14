package com.interview.design.factory.abstractFactory;

import com.interview.design.factory.abstractFactory.factory.Factory;
import com.interview.design.factory.abstractFactory.factory.impl.BusFactory;
import com.interview.design.factory.abstractFactory.factory.impl.TrucksFactory;
import com.interview.design.factory.abstractFactory.product.car.Car;
import com.interview.design.factory.abstractFactory.product.insurance.Insurance;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 0:42 2019/1/13
 */
public class TestAbstractFactory {

    public static void main(String[] args) {
        Factory factory;
        Car car;
        Insurance insurance;
        factory = new BusFactory();
        car = factory.createCar();
        car.drive();
        insurance = factory.attachInsurance();
        insurance.print();

        System.out.println();

        factory = new TrucksFactory();
        car = factory.createCar();
        car.drive();
        insurance = factory.attachInsurance();
        insurance.print();
    }

}
