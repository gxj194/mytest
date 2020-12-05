package com.bjpowernode.priority;

public class Test {
    public static void main(String[] args) {
        MyPriority myPriority1 = new MyPriority("线程一优先级最高");
        MyPriority myPriority2 = new MyPriority("线程二优先级最低");

        //设置优先级
        myPriority1.setPriority(Thread.MAX_PRIORITY);
        myPriority2.setPriority(Thread.MIN_PRIORITY);

        myPriority1.start();
        myPriority2.start();
    }
}
