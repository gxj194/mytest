package com.bjpowernode.syn.ticket;

public class Test01 {
    public static void main(String[] args) {
        TicketThread t1 = new TicketThread();
        t1.setName("窗口一");
        TicketThread t2 = new TicketThread();
        t2.setName("窗口二");
        TicketThread t3 = new TicketThread();
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
