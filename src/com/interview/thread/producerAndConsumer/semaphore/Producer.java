package com.interview.thread.producerAndConsumer.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 19:20 2019/1/13
 */
public class Producer implements Runnable {
    private Queue queue;
    private Semaphore emptySemaphore ;
    private Semaphore fullSemaphore ;
    private Semaphore mutexSemaphore ;

    public Producer(Queue queue,Semaphore emptySemaphore,Semaphore fullSemaphore,Semaphore mutexSemaphore){
        this.queue = queue;
        this.emptySemaphore = emptySemaphore;
        this.fullSemaphore = fullSemaphore;
        this.mutexSemaphore = mutexSemaphore;
    }

    private void produce(){
        System.out.println("当前产品数："+queue.size());
        String product = "产品"+(int)(Math.random()*10000);
        System.out.println(Thread.currentThread().getName()+"我生产了一件产品"+product);
        queue.offer(product);
    }

    @Override
    public void run() {
        while (true){
            try {
                //生产产品时获取一个令牌（总数为maxCap个），并占有此令牌，在产品被消费时此令牌才会被释放
                fullSemaphore.acquire();
                //获取同步信号量的令牌(总数为1)，所以来保证对产品队列的操作能同步进行
                mutexSemaphore.acquire();
                //产品生产过程
                produce();
                //释放同步信号量令牌
                mutexSemaphore.release();
                //产品生产过程结束，释放emptySemaphore信号量的令牌，让消费者可以获取此信号量的令牌进行消费
                emptySemaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
