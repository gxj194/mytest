package com.bjpowernode.yield;



public class Test {
    public static void main(String[] args) {
        MyYield myYield1 = new MyYield("线程会暂停");
        MyYield2 myYield2 = new MyYield2("线程不会暂停");

        myYield1.start();
        myYield2.start();
    }
}
