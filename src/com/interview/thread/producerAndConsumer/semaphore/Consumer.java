package com.interview.thread.producerAndConsumer.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 19:36 2019/1/13
 */
public class Consumer implements Runnable {
    private Queue queue;
    private Semaphore emptySemaphore ;
    private Semaphore fullSemaphore ;
    private Semaphore mutexSemaphore ;

    public Consumer(Queue queue,Semaphore emptySemaphore,Semaphore fullSemaphore,Semaphore mutexSemaphore){
        this.queue = queue;
        this.emptySemaphore = emptySemaphore;
        this.fullSemaphore = fullSemaphore;
        this.mutexSemaphore = mutexSemaphore;
    }

    private void consume() {
        System.out.println("当前产品数："+queue.size());
        String product = (String) queue.poll();
        System.out.println(Thread.currentThread().getName()+"我消费了一件产品"+product);
    }

    @Override
    public void run() {
        while (true){
            try {
                //获取emptySemaphore信号量的令牌，当此信号量未被release释放前，该过程一直处于阻塞状态
                emptySemaphore.acquire();
                //获取同步信号量的执行令牌
                mutexSemaphore.acquire();
                //执行消费者的消费过程
                consume();
                //释放同步信号量的执行令牌
                mutexSemaphore.release();
                //释放fullSemaphore信号量，代表产品队列中的一个产品被消费了，fullSemaphore中的可用令牌数目+1
                fullSemaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
