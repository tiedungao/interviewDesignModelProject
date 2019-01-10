package com.interview.design.singleton;

/**
 * @Auther: gaoti
 * @Date: 2018/10/24 21:39
 * @Description:
 */
public class SecondSingleton {
    private static SecondSingleton secondSingleton = new SecondSingleton();
    private SecondSingleton(){};

    public static SecondSingleton  getSecondSingleton(){
        if (null == secondSingleton){
            secondSingleton = new SecondSingleton();
        }

        return secondSingleton;
    }

}
