package com.interview.thread.producerAndConsumer.waitAndNotify;

import java.util.List;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 14:46 2019/1/13
 */
public class Consumer implements Runnable{
    //产品队列
    private List<String> storage;
    //产品队列最大容量
    private int maxCap;

    public Consumer(List storage,int maxCap){
        this.storage = storage;
        this.maxCap = maxCap;
    }

    private void consume(){
        System.out.println(Thread.currentThread().getName()+"我消费了一件商品"+storage.get(0));
        storage.remove(0);
    }

    @Override
    public void run() {
        while (true){
            synchronized (storage){
                if (storage.isEmpty()){
                    System.out.println("storage is empty");
                    try {
                        //如果产品队列为空，则让消费者线程等待
                        storage.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                consume();
                //唤醒所有等待线程
                storage.notifyAll();
            }
        }


    }
}
