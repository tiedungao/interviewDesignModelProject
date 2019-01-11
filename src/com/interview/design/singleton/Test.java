package com.interview.design.singleton;

import com.interview.design.singleton.enums.SingletonEnums;
import com.interview.design.singleton.hungry.SingletonHungry;
import com.interview.design.singleton.idler.common.SingletonIdler;
import com.interview.design.singleton.idler.safe.SingletonIdlerSafe;
import com.interview.design.singleton.staticInner.SingletonStaticInner;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 17:33 2019/1/11
 */
public class Test {

    public static void main(String[] args) {
        SingletonIdler idler = SingletonIdler.getSingletonIdler();
        System.out.println(idler.hashCode());
        SingletonIdler idler1 = SingletonIdler.getSingletonIdler();
        System.out.println(idler1.hashCode());

        SingletonIdlerSafe safe = SingletonIdlerSafe.getSingletonIdlerSafe();
        System.out.println(safe.hashCode());
        SingletonIdlerSafe safe1 = SingletonIdlerSafe.getSingletonIdlerSafe();
        System.out.println(safe1.hashCode());

        SingletonHungry singletonHungry = SingletonHungry.getSingletonHungry();
        System.out.println(singletonHungry.hashCode());
        SingletonHungry singletonHungry1 = SingletonHungry.getSingletonHungry();
        System.out.println(singletonHungry1.hashCode());

        SingletonStaticInner singletonStaticInner = SingletonStaticInner.getSingletonStaticInner();
        System.out.println(singletonStaticInner.hashCode());
        SingletonStaticInner singletonStaticInner1 = SingletonStaticInner.getSingletonStaticInner();
        System.out.println(singletonStaticInner1.hashCode());

        SingletonEnums singletonEnums = SingletonEnums.INSTANCES;
        System.out.println(singletonEnums.hashCode());
        SingletonEnums singletonEnums1 = SingletonEnums.INSTANCES;
        System.out.println(singletonEnums1.hashCode());



    }

}
