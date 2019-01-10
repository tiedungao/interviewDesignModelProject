package com.interview.thread;

import java.util.concurrent.Semaphore;

/**
 * @Auther: gaoti
 * @Date: 2018/11/20 15:58
 * @Description:
 */
public class SemaphoreTest implements Runnable{
    Semaphore semaphore = new Semaphore(3);
    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+"获得执行权限");
            semaphore.availablePermits();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {

        }
    }

    public static void main(String[] args) {
        SemaphoreTest semaphore = new SemaphoreTest();
        Thread thread1 = new Thread(semaphore);
        thread1.setName("Thread1");
        Thread thread2 = new Thread(semaphore);
        thread2.setName("Thread2");
        Thread thread3 = new Thread(semaphore);
        thread3.setName("Thread3");
        Thread thread4 = new Thread(semaphore);
        thread4.setName("Thread4");
        Thread thread5 = new Thread(semaphore);
        thread5.setName("Thread5");
        Thread thread6 = new Thread(semaphore);
        thread6.setName("Thread6");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
