package com.interview.javaBase;

/**
 * @Auther: gaoti
 * @Date: 2018/11/24 17:37
 * @Description:
 */
public class ArithmeticDemo1 {

    static int sum = 0;

    public static void main(String[] args) {
        //condition(30);
        System.out.println(condition(30));
    }

    public static int condition(int total){
        if(total > 3){
            return condition(total-1)+condition(total-2)+condition(total-3);
        }else if (total == 3){
            return 4;
        }else if (total == 2) {
            return 2;
        }
        return 1;
    }




}
