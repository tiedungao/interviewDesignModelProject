package com.interview.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: gaoti
 * @Date: 2018/11/20 14:58
 * @Description:
 */
public class ReentrantLockTest implements Runnable {

    public static int i = 0;
    public static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int j=0;j<10000;j++){
            //lock.lock();
            lock.lock();
            try {
                i++;
            }finally {
                    lock.unlock();
                //lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockTest reentrantLockTest = new ReentrantLockTest();
        Thread thread1 = new Thread(reentrantLockTest);
        Thread thread2 = new Thread(reentrantLockTest);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(i);
    }
}
