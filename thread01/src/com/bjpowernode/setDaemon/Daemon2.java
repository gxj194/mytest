package com.bjpowernode.setDaemon;

/**
 * 前台或后台线程的设定
 */
public class Daemon2 extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
