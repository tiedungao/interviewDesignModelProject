package com.interview.thread.producerAndConsumer.waitAndNotify;

import java.util.List;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 14:46 2019/1/13
 */
public class Producer implements Runnable{
    //产品队列
    private List<String> storage;
    //队列最大容量
    private int maxCap;

    public Producer(List storage,int maxCap){
        this.storage = storage;
        this.maxCap = maxCap;
    }
    //生产方法
    public void produce(){
        String product = "产品"+(int)(Math.random()*10000);
        System.out.println(Thread.currentThread().getName()+"我生产了一件产品"+product);
        storage.add(product);
    }

    @Override
    public void run() {
        while (true){
            synchronized (storage){
                while (storage.size() == maxCap){
                    System.out.println("storage is full");
                    try {
                        //如果产品队列满了，则让生产者线程等待
                        storage.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                produce();
                //唤醒所有等待线程
                storage.notifyAll();
            }
        }

    }
}
