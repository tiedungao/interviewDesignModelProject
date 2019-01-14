package com.interview.thread.producerAndConsumer.semaphore;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 19:45 2019/1/13
 */
public class Test {

    public static void main(String[] args) {
        int maxCap = 10;                            //产品队列的最大容量
        Queue<String> queue = new LinkedList();     //产品队列
        //初始化一个为0的信号量，只允许release,不允许acquire，当emptySemaphore被release后则可以acquire
        Semaphore emptySemaphore = new Semaphore(0);
        //初始化一个为maxCap的信号量作为队列中生产者线程的信号量，在不release的前提下最多允许被maxCap个线程acquire到
        Semaphore fullSemaphore = new Semaphore(maxCap);
        //同步信号量，同时只能被一个线程acquire到，用来产品队列的修改能同步进行
        Semaphore mutexSemaphore = new Semaphore(1);

        //创建生产者消费者实例
        Producer producer = new Producer(queue,emptySemaphore,fullSemaphore,mutexSemaphore);
        Consumer consumer = new Consumer(queue,emptySemaphore,fullSemaphore,mutexSemaphore);
        //创建线程
        Thread producerThread = new Thread(producer,"producerThread");
        Thread producerThread1 = new Thread(producer,"producerThread1");
        Thread consumerThread = new Thread(consumer,"consumerThread");
        Thread consumerThread1 = new Thread(consumer,"consumerThread1");
        //启动线程
        producerThread.start();
        producerThread1.start();
        consumerThread.start();
        consumerThread1.start();
    }

}
