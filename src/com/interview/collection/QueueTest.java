package com.interview.collection;

import java.util.AbstractQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Auther: gaoti
 * @Date: 2018/11/20 19:39
 * @Description:
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedBlockingQueue();
        queue.add("str2");
        queue.add("str1");
        String str1 = queue.poll();
        String str2 = queue.poll();
        String str3 = queue.poll();
        //String str4 = queue.remove();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        //System.out.println(str4);
        System.out.println(queue.isEmpty());
    }

}
