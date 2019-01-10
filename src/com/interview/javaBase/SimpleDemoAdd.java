package com.interview.javaBase;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;

/**
 * @Auther: gaoti
 * @Date: 2018/11/20 18:30
 * @Description:
 */
public class SimpleDemoAdd {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        i = i++;
        System.out.println(i++);
        j = ++j;
        j = ++j;
        j = ++j;
        j = ++j;
        j = ++j;
        j = ++j;
        System.out.println(j);
    }

}
