package com.bjpowernode.priority;

/**
 * 设置优先级
 */
public class MyPriority extends Thread{
    public MyPriority(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
