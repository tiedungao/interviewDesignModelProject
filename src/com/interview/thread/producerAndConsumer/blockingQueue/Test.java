package com.interview.thread.producerAndConsumer.blockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 17:02 2019/1/13
 */
public class Test {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        int maxCap = 10;
        BlockingQueue blockingQueue = new LinkedBlockingQueue(maxCap);

        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);

        Thread producerThread = new Thread(producer,"producerThread");
        Thread producerThread1 = new Thread(producer,"producerThread1");

        Thread consumerThread = new Thread(consumer,"consumerThread");
        Thread consumerThread1 = new Thread(consumer,"consumerThread1");

        producerThread.start();
        consumerThread.start();

        producerThread1.start();
        consumerThread1.start();

    }

}
