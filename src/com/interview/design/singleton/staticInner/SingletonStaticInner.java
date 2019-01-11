package com.interview.design.singleton.staticInner;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 17:26 2019/1/11
 */
public class SingletonStaticInner {

    private SingletonStaticInner(){

    }

    private static class StaticInner{
        private static final SingletonStaticInner singletonStaticInner = new SingletonStaticInner();
    }

    public static SingletonStaticInner getSingletonStaticInner(){
        return StaticInner.singletonStaticInner;
    }

}
