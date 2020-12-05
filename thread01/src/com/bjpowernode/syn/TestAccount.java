package com.bjpowernode.syn;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(123456789,"农业银行",1000);

        //使用线程来完成取款的操作
        PersonA personA = new PersonA();
        Thread t1 = new Thread(personA,"张三");

        PersonA personB = new PersonA();
        Thread t2 = new Thread(personB,"张三媳妇儿");

        //将该张银行卡绑定给每一个线程
        personA.account = account;
        personB.account = account;

        //启动线程
        t2.start();
        t1.start();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("账户余额为:"+account.getBalance());
    }
}
