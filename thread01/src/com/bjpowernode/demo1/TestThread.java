package com.bjpowernode.demo1;

/**
 * 在程序中有两个线程在工作：main线程，自定义线程thread-0
 *  对于多线程的这种执行的结果是因为：多线程之间存在争抢的关系，多线程程序都是抢占式的运行。
 */

public class TestThread {
    //jvm自动开启的主线程执行的代码。
    public static void main(String[] args) {
        MyThread myThread = new MyThread(); //主线程执行的，主线程是由jvm自动开启的。
       // myThread.run();//通过对象调用了方法，是单线程的写法
        myThread.start();//开启了一个新的线程，新的线程就会加入到jvm进程中，执行
        for (int i=1;i<100;i++){
            //输出当前正在执行的线程是哪一个线程
            String name = Thread.currentThread().getName();
            System.out.println("主方法main方法执行:"+name+"----->"+i);
        }
    }
}
