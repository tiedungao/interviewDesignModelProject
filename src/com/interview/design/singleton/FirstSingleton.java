package com.interview.design.singleton;

/**
 * @Auther: gaoti
 * @Date: 2018/10/24 21:29
 * @Description:
 */
public class FirstSingleton {
    private static FirstSingleton singleton = null;
    private FirstSingleton(){}

    public static FirstSingleton getSingleton(){
        if (null == singleton){
            singleton = new FirstSingleton();
        }
        return singleton;
    }
}
