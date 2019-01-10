package com.interview.design.singleton;

/**
 * @Auther: gaoti
 * @Date: 2018/10/24 21:31
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        FirstSingleton singleton = FirstSingleton.getSingleton();
        System.out.println(singleton.toString());
        System.out.println("NO---:"+(new NoSingleton()).toString());
        SecondSingleton secondSingleton = SecondSingleton.getSecondSingleton();
        System.out.println("Second----："+secondSingleton.toString());
        run();
    }

    public static void run(){
        FirstSingleton singleton = FirstSingleton.getSingleton();
        System.out.println(singleton.toString());
        System.out.println("NO---:"+(new NoSingleton()).toString());
        SecondSingleton secondSingleton = SecondSingleton.getSecondSingleton();
        System.out.println("Second----："+secondSingleton.toString());
    }

}
