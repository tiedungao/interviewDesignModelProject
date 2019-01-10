package com.interview.thread;

import java.util.Date;

/**
 * @Auther: gaoti
 * @Date: 2018/11/20 15:35
 * @Description:
 */
public class ThreadCount implements Runnable{

    public static int count = 0;
    public static int num = 0;

    @Override
    public synchronized void run() {
        for (int i=0;i<500000;i++){
            count++;
        }
    }

    public void count(){
        for (int j=0;j<1000000;j++){
            num++;
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadCount threadCount = new ThreadCount();

        threadCount.count();

        Thread.sleep(1000);

        Thread thread1 = new Thread(threadCount);
        Thread thread2 = new Thread(threadCount);
        thread1.start();
        thread2.start();

        Thread.sleep(1000);
        System.out.println("count"+count);
        System.out.println(num);
    }
}
