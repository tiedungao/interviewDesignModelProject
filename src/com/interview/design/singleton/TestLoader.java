package com.interview.design.singleton;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 18:11 2019/1/11
 */
public class TestLoader {

    public static void main(String[] args) {
        Class cls;
        try {
            cls = Class.forName("com.interview.design.singleton.enums.SingletonEnums");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
