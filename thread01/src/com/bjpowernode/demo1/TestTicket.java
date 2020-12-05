package com.bjpowernode.demo1;

public class TestTicket {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket();
        ticket1.setName("窗口一");
        ticket1.start();

        Ticket ticket2 = new Ticket();
        ticket2.setName("窗口二");
        ticket2.start();

        Ticket ticket3 = new Ticket();
        ticket3.setName("窗口三");
        ticket3.start();
    }
}
