package com.test;

import com.sun.javafx.tk.Toolkit;

/**
 * @Auther: gaoti
 * @Date: 2018/11/11 21:55
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        DateUtil dateUtil = DateUtil.getDateUtil();
        System.out.println(dateUtil.toString());
        dateUtil.getCurrentDate();
        System.out.println(new Thread().getName());
        dateUtil = DateUtil.getDateUtil();
        System.out.println(dateUtil.toString());
        dateUtil.getCurrentDate();

    }
}
