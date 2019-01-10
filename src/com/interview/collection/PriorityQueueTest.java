package com.interview.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @Auther: gaoti
 * @Date: 2018/11/20 20:10
 * @Description:
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue();
        priorityQueue.add("c");
        priorityQueue.add("a");
        priorityQueue.add("f");
        priorityQueue.add("b");
        priorityQueue.add("d");
        priorityQueue.add("e");

        Iterator<String> it = priorityQueue.iterator();
        if (null != it){
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
}
