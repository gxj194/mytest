package com.bjpowernode.syn.ticket;

public class TicketRunnable implements Runnable {
    private  int ticket = 100;
    @Override
    public void run() {
        while (true){
         synchronized (this){
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
