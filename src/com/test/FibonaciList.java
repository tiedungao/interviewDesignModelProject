package com.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FibonaciList {

    public static List<Integer> fibonaciList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(new Date());
        getFibonaciList(fibonaciList, 0);

        System.out.println(fibonaciList.get(100));
        System.out.println(new Date());
    }

    public static List<Integer> getFibonaciList(List<Integer> list, int location) {
        if (location > 100) {
            System.out.println();
            System.out.println(new Date());
            return fibonaciList;
        }
        if (1 < location) {
            fibonaciList.add(fibonaciList.get(location - 2) + fibonaciList.get(location - 1));
            getFibonaciList(fibonaciList, location + 1);
        } else {
            fibonaciList.add(1);
            getFibonaciList(fibonaciList, location + 1);
        }

        return fibonaciList;
    }


    /*public static int getFibonaciList(int location){
        if (location < 2){
            return 1;
        }else{
            return getFibonaciList(location-1)+getFibonaciList(location-2);
        }
    }*/

}
