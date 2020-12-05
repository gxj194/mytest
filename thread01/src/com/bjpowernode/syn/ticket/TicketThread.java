package com.bjpowernode.syn.ticket;

public class TicketThread extends Thread {
    private static int ticket = 1000;
    @Override
    public void run() {
        while (true){
             synchronized ("a"){
                boolean b = checkTicket();
                if(!b){
                    break;
                }
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
