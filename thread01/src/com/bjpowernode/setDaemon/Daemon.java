package com.bjpowernode.setDaemon;

/**
 * 前台或后台线程的设定
 */
public class Daemon extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
