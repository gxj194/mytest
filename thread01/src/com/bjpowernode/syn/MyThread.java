package com.bjpowernode.syn;

public class MyThread implements Runnable {
    @Override
    public synchronized void run() {
        for (int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
