package com.bjpowernode.setDaemon;

import com.bjpowernode.sleep.MySleep;

public class Test {
    public static void main(String[] args) {
        Daemon daemon1 = new Daemon();
        Daemon2 daemon2 = new Daemon2();

        //设置线程名称
        daemon1.setName("前台线程");
        daemon2.setName("后台线程");

        //设置线程的性质
        daemon1.setDaemon(false);
        daemon2.setDaemon(true);

        daemon1.start();
        daemon2.start();
    }
}
