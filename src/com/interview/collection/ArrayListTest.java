package com.interview.collection;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Auther: gaoti
 * @Date: 2018/11/20 20:21
 * @Description:
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(9);
        list.add(5);
        for (Object item:list){
            System.out.print(item+" ");
        }
        System.out.println();
        Collections.sort(list);
        for (Object item:list){
            System.out.print(item+" ");
        }
    }
}
