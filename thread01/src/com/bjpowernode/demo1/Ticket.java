package com.bjpowernode.demo1;

/**
 * 假设有3个窗口，每个窗口有100张票，三个窗口之间独立售票，知道售票结束
 */
public class Ticket extends  Thread{
    private int ticket = 100;
    @Override
    public void run(){
        while (true){
            ticket--;
            System.out.println(Thread.currentThread().getName()+"销售了一张票,还剩余"+ticket+"张票");
            if(ticket==0){
                break;
            }
        }
    }


}
