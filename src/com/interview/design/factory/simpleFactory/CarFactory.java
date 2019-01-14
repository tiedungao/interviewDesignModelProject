package com.interview.design.factory.simpleFactory;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 21:01 2019/1/11
 */
public class CarFactory {

    public static Car createCar(String carName){
        switch (carName){
            case "bus":
                return new Bus("bus");
            case "trucks":
                return new Trucks("trucks");
            default:
                return new Sedan("sedan");
        }
    }

}
