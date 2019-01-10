package com.interview.design.singleton;

/**
 * @Auther: gaoti
 * @Date: 2018/10/24 22:56
 * @Description:
 */
public class DoubleLockSingleton {
    private static DoubleLockSingleton doubleLockSingleton;
    private DoubleLockSingleton(){
    }

    public DoubleLockSingleton getInstance(){
        if (null == doubleLockSingleton){
            synchronized (this){
                if(null == doubleLockSingleton){
                    doubleLockSingleton = new DoubleLockSingleton();
                }
            }
        }
        return doubleLockSingleton;
    }
}
