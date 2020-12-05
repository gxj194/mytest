package com.bjpowernode.producer_consumer;

import java.util.List;

/**
 * 消费者线程
 */
public class Consumer implements  Runnable{

    //消费者要从这个容器中消费商品
    private List<Object> list;
    public void setList(List<Object> list) {
        this.list = list;
    }
    @Override
    public void run() {
        //加入线程同步，让生产者对于容器拥有使用权
        synchronized (list){
                    while (true){
                        //先考虑什么时候消费者要阻塞
                        if(list.size() == 0){
                            try {
                                list.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        //如果程序执行到此处，说明容器中是有商品的，就可以进行消费
                        Object remove = list.remove(0);
                        try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //容器已经没有了商品，提醒生产者进行生产
                list.notifyAll();
                System.out.println(Thread.currentThread().getName()+"消费了一个商品--->"+remove);
            }
        }
    }

}
