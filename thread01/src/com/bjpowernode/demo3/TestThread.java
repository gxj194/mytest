package com.bjpowernode.demo3;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //需要将myThread作为一个任务来处理，定义成一个任务
        FutureTask futureTask = new FutureTask(myThread);
        //借助于Thread父类完成线程的工作
        Thread t1 = new Thread(futureTask);
        t1.start();

//        try {
//            Object obj = futureTask.get();
//            System.out.println(obj);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

        for (int i=1;i<100;i++){
            //输出当前正在执行的线程是哪一个线程
            String name = Thread.currentThread().getName();
            System.out.println("main线程:"+name+"----->"+i);
        }
    }
}
