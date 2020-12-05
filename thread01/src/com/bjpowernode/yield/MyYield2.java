package com.bjpowernode.yield;

/**
 * 线程的暂停方法
 */
public class MyYield2 extends Thread{
    public MyYield2(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
