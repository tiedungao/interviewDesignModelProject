package com.interview.design.singleton.idler.safe;

import com.interview.design.singleton.idler.common.SingletonIdler;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 16:23 2019/1/11
 */
public class SingletonIdlerSafe {
    private static volatile SingletonIdlerSafe singletonIdlerSafe;

    private SingletonIdlerSafe(){

    }

    public static SingletonIdlerSafe getSingletonIdlerSafe(){
        if (null == singletonIdlerSafe){
           synchronized (SingletonIdlerSafe.class){
                if (null == singletonIdlerSafe){
                    singletonIdlerSafe = new SingletonIdlerSafe();
                }
           }
        }
        return singletonIdlerSafe;
    }

}
