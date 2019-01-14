package com.interview.thread.producerAndConsumer.blockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 17:05 2019/1/13
 */
public class Producer implements Runnable {
    //阻塞队列
    private BlockingQueue blockingQueue;

    public Producer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    private void produce() {
        String product = "产品"+(int)(Math.random()*10000);
        System.out.println(Thread.currentThread().getName()+"我生产了一件产品"+product);
        try {
            blockingQueue.put(product);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true){
            produce();
        }
    }
}
