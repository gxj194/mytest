package com.bjpowernode.producer_consumer;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //初始化容器对象
        List<Object> list = new ArrayList<Object>();

        Consumer consumer = new Consumer();
        consumer.setList(list);
        Producer producer = new Producer();
        producer.setList(list);

        Thread t1 = new Thread(consumer,"消费者线程");
        Thread t2 = new Thread(producer,"生产者线程");

        t1.start();
        t2.start();

    }
}
