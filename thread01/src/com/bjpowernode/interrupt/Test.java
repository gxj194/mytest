package com.bjpowernode.interrupt;


import java.io.InputStream;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyInterrupt myInterrupt = new MyInterrupt();
        myInterrupt.start();

        System.out.println("程序正在执行，如果输入任何内容，自定义线程结束。。。。");

        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(next);

        //如果用户输入内容了，调用一下中断线程的方法
        myInterrupt.interrupt();
        System.out.println("主函数结束");


    }
}
