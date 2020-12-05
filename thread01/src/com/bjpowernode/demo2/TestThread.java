package com.bjpowernode.demo2;

public class TestThread {
    public static void main(String[] args) {
        MyThread02 myThread02 = new MyThread02();
        //所有的线程启动都需要借助于Thread类中的start
        Thread thread1 = new Thread(myThread02,"自定义线程01");

        //启动线程
        thread1.start();

        for (int i=1;i<100;i++){
            String name = Thread.currentThread().getName();
            System.out.println("main线程输出:"+name+"----->"+i);
        }
    }
}
