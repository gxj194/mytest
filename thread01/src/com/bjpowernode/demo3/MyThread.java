package com.bjpowernode.demo3;

import java.util.concurrent.Callable;

/**
 * 方式三：了解即可
 */
public class MyThread implements Callable<Integer> {

    /**
     * 相当于run方法
     *
     * 这种写法会存在返回值
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        for (int i=1;i<100;i++){
            //输出当前正在执行的线程是哪一个线程
            String name = Thread.currentThread().getName();
            System.out.println("自定义线程中的run方法执行:"+name+"----->"+i);
        }
        System.out.println("!!!!!!!!!自定义线程执行完毕!!!!!!!!!!!!!");
        return 10;
    }
}
