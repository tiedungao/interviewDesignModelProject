package com.interview.design.singleton.idler.common;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 16:18 2019/1/11
 */
public class SingletonIdler {

    private static SingletonIdler singletonIdler;

    private SingletonIdler(){
    }

    public static SingletonIdler getSingletonIdler(){
        if (null == singletonIdler){
            singletonIdler = new SingletonIdler();
        }
        return singletonIdler;
    }

}
