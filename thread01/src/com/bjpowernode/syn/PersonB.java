package com.bjpowernode.syn;

public class PersonB implements Runnable {
    Account account;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在取款......");
        account.withDraw(800);
    }
}
