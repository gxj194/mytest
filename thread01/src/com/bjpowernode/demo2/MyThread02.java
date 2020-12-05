package com.bjpowernode.demo2;

/**
 * 让普通类实现java中的Runnable接口
 * 重写run方法
 * 借助于Thread类进行线程的启动
 */
public class MyThread02 implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<100;i++){
            String name = Thread.currentThread().getName();
            System.out.println("自定义线程中的run方法执行:"+name+"----->"+i);
        }
    }
}
