package com.bjpowernode.producer_consumer;

import java.util.List;

/**
 * 生产者线程
 */
public class Producer implements Runnable{
    //商品生产出来之后，放入该容器
    private List<Object> list;
    public void setList(List<Object> list) {
        this.list = list;
    }
    @Override
    public void run() {
            //加入线程同步，让生产者对于容器拥有使用权
        synchronized (list){
            while (true){
                //先考虑什么时候生产者线程要阻塞
                if(list.size() == 1){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //如果程序执行到此处，说明容器是空的，生产者应该生产商品
                Object obj = new Object();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.add(obj);
                //容器已经有了商品，消费者线程可以进行工作
                list.notifyAll();
                System.out.println(Thread.currentThread().getName()+"生产了一个商品--->"+obj);
            }
        }
    }
}
