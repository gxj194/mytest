package com.bjpowernode.syn.ticket;

public class Test03 {
    public static void main(String[] args) {
        TicketLock ticketLock = new TicketLock();

        Thread t1 = new Thread(ticketLock,"窗口一");
        Thread t2 = new Thread(ticketLock,"窗口二");
        Thread t3 = new Thread(ticketLock,"窗口三");


        t1.start();
        t2.start();
        t3.start();
    }
}
