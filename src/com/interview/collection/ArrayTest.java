package com.interview.collection;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @Auther: gaoti
 * @Date: 2018/11/20 20:36
 * @Description:
 */
public class ArrayTest {
    public static void main(String[] args) {
        String [] strArr = new String[10];
        for (int i=0;i< strArr.length;i++){
            strArr[i] = "a"+i;
        }

        System.out.println(Arrays.toString(strArr));

        System.out.println(Arrays.deepToString(strArr));
    }
}
