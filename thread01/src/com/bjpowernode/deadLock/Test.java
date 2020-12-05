package com.bjpowernode.deadLock;

public class Test {
    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();

        Thread t1 = new Thread(deadLock,"小明");
        Thread t2 = new Thread(deadLock,"小红");

        t1.start();
        t2.start();
    }
}
