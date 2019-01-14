package com.interview.thread.producerAndConsumer.blockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 17:11 2019/1/13
 */
public class Consumer implements Runnable {
    private BlockingQueue blockingQueue;

    public Consumer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    private void consume() {
        String product = null;
        try {
            product = (String) blockingQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"我消费了一件商品"+product);
    }

    @Override
    public void run() {
        while (true){
            consume();
        }
    }
}
