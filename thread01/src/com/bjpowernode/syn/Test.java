package com.bjpowernode.syn;

public class Test {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
//        MyThread myThread2 = new MyThread();
//        MyThread myThread3 = new MyThread();

        Thread t1 = new Thread(myThread1,"线程一");
        Thread t2 = new Thread(myThread1,"线程二");
        Thread t3 = new Thread(myThread1,"线程三");

        t1.start();
        t2.start();
        t3.start();
    }
}
