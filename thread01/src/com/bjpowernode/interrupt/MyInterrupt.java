package com.bjpowernode.interrupt;

public class MyInterrupt extends Thread {
    @Override
    public void run() {
        System.out.println("自定义线程程序开始");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("自定义线程程序结束!!!!!!!!!!!!!!!!!");
    }
}
