package com.interview.design.singleton.hungry;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 16:53 2019/1/11
 */
public class SingletonHungry {

    private static final SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry(){
        System.out.println("初始化工作");
    }

    public static SingletonHungry getSingletonHungry(){
        System.out.println("获取方法");
        return singletonHungry;
    }

}
