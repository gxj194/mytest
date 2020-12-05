package com.bjpowernode.demo2;


public class TestTicket {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket();
        Thread thread1 = new Thread(ticket1,"窗口01");
        thread1.start();

        Ticket ticket2 = new Ticket();
        Thread thread2 = new Thread(ticket2,"窗口02");
        thread2.start();

        Ticket ticket3 = new Ticket();
        Thread thread3 = new Thread(ticket3,"窗口03");
        thread3.start();

        ///////////////////数据在线程中共享，同时不加控制，数据会出现问题//////////////
//        Ticket ticket1 = new Ticket();
//        Thread thread1 = new Thread(ticket1,"窗口01");
//        Thread thread2 = new Thread(ticket1,"窗口02");
//        Thread thread3 = new Thread(ticket1,"窗口03");
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
    }
}
