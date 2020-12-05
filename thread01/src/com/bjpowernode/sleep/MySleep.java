package com.bjpowernode.sleep;

/**
 * 线程休眠的方法
 */
public class MySleep extends Thread{
    public MySleep(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+i);

            //线程休眠 时间单位毫秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
