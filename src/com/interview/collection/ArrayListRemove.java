package com.interview.collection;

import java.util.ArrayList;

/**
 * @author :gaotiedun
 */
public class ArrayListRemove implements Runnable{
    private static ArrayList<Integer> list = new ArrayList<>();
    static {
        list.add(1);
        list.add(3);
        list.add(2);

    }


    public static void main(String[] args) {
        ArrayListRemove arrayListRemove = new ArrayListRemove();
        Thread thread1 = new Thread(arrayListRemove);
        Thread thread2 = new Thread(arrayListRemove);
        thread2.setName("Thread2");

        thread1.start();
        thread2.start();
    }



    @Override
    public void run() {
        //System.out.println(list.get(2));
        if (Thread.currentThread().getName().equals("Thread2")){
            list.remove(2);
            System.out.println("remove!");
        }else{
            list.forEach(System.out::println);
        }

    }
}
