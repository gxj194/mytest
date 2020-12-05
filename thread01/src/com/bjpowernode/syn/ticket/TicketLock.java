package com.bjpowernode.syn.ticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 了解
 *  方式三：本地重入锁
 */
public class TicketLock implements Runnable {
    private  int ticket = 1000;
    Lock lock = new ReentrantLock();//可以作为线程锁来使用，也可以做到线程同步的效果，更灵活，不用考虑监视器对象问题
    @Override
    public void run() {
        while (true){
            try {
                lock.lock(); //在此行代码开始，程序进入线程同步的程序
                boolean b = checkTicket();
                if(!b){
                    break;
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();//到此行代码结束线程同步,必须执行
            }
        }
    }
    public  boolean checkTicket(){
        if(ticket < 1){
            return false;
        }
        ticket--;
        System.out.println(Thread.currentThread().getName()+"售出了一张票，剩余:"+ticket);
        return true;
    }
}
