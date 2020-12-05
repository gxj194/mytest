package com.bjpowernode.join;
/*
    乌龟线程
 */
public class WuGui extends Thread {
    TuZi tuZi;
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"米");
            //乌龟在跑到一半时休息了，休息到兔子线程到达终点时醒来，继续执行
            if(i == 5) {
                try {
//                    Thread.sleep(7500);
                    //换一个方法控制线程，join方法，会让当前线程，兔子线程休眠，休眠到另一个线程执行完毕时
                    //必须是由另一个线程让当前线程休眠
                    tuZi.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            //设置乌龟线程的速度
            try {
                Thread.sleep(877);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
