package com.interview.thread;

/**
 * @Auther: gaoti
 * @Date: 2018/11/20 09:29
 * @Description:
 */
public class Counter {
    private static int counter = 0;

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                count();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                count();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                count();
            }
        }.start();
    }

    public static  void count(){
        Counter count = new Counter();
        synchronized (count) {
            for (int i = 0; i < 100; i++){
                counter++;
                System.out.println("当前线程执行完毕:"+Thread.currentThread().getName()+",当前值为："+counter);
            }
            try {
                count.wait();
                Thread.sleep(10);
                count.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
         count.notifyAll();
        System.out.println("当前线程执行结束:"+Thread.currentThread().getName()+",当前值为："+counter);
    }

}
