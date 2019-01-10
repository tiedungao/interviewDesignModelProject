package com.interview.reflect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Auther: gaoti
 * @Date: 2018/11/21 17:22
 * @Description:
 */
public class LambdaTest {
    private static final String str1 = "gaotiedun";

    public static void main(String[] args) {
        String lamb = "lamb";
        //lamb = changeLamb(lamb);
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("World");

        list.forEach(System.out::println);
    }

    public static String changeLamb(String lamb){
        return lamb+"_change";
    }

}
