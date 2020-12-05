package com.bjpowernode.demo1;

/**
 * 自定义线程方式一：
 *
 * 1.普通类继承线程类Thread
 * 2.重写父类中的run方法
 * 3.通过自定义线程对象，调用其start()方法，开启线程
 */
public class MyThread extends Thread{
    /**
     * run方法相当于main方法
     * 自定义线程要完成的工作，自定义线程会自动执行run方法
     */
    @Override
    public void run() {
        for (int i=1;i<100;i++){
            //输出当前正在执行的线程是哪一个线程
            String name = Thread.currentThread().getName();
            System.out.println("自定义线程中的run方法执行:"+name+"----->"+i);
        }
    }
}
