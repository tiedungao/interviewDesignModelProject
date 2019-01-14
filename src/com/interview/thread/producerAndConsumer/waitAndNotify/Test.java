package com.interview.thread.producerAndConsumer.waitAndNotify;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 14:58 2019/1/13
 */
public class Test {

    public static void main(String[] args) {
        //产品队列,当然使用Queue也是可以的
        List<String> storage = new LinkedList<>();
        int maxCap = 10;
        //生产者
        Producer producer = new Producer(storage,maxCap);
        //消费者
        Consumer consumer = new Consumer(storage,maxCap);

        //创建生产者消费者线程
        Thread threadProducer = new Thread(producer,"threadProducer");
        Thread threadProducer1 = new Thread(producer,"threadProducer1");
        Thread threadProducer2 = new Thread(producer,"threadProducer2");
        Thread threadConsumer = new Thread(consumer,"threadConsumer");
        Thread threadConsumer1 = new Thread(consumer,"threadConsumer1");

        //执行生产者消费者线程的start方法启动线程
        threadProducer.start();
        threadConsumer1.start();
        threadProducer2.start();

        threadProducer1.start();
        threadConsumer.start();


    }

}
