package com.interview.design.factory.abstractFactory.factory;

import com.interview.design.factory.abstractFactory.product.car.Car;
import com.interview.design.factory.abstractFactory.product.insurance.Insurance;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 0:26 2019/1/13
 */
public interface Factory {

    //创建汽车产品
    public Car createCar();

    //为汽车绑定保险
    public Insurance attachInsurance();
}
