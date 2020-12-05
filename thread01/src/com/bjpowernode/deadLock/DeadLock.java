package com.bjpowernode.deadLock;

public class DeadLock implements Runnable{
    Pencil pencil = new Pencil();
    Rubber rubber = new Rubber();
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if(name.equals("小明")){//正在执行的是小明线程
                    synchronized (pencil){//在这块代码中，只能是小明线程在执行，pencil对象也只能是小明线程在使用
                        System.out.println(name+"正在使用铅笔pencil....");
                try {
//                    Thread.sleep(1000);
                    pencil.wait(); //让当前线程小明进入等待不执行，无限期等待，不会自动执行，必须被另外的线程唤醒才可以执行
                                    //pencil对象会被线程释放
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //在此处小明线程准备使用橡皮对象
                synchronized (rubber){//在这块代码中，只能是小明线程在执行，rubber对象也只能是小明线程在使用
                    System.out.println(name+"正在使用橡皮rubber....");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(name+"橡皮rubber使用完毕....");
                }
                System.out.println(name+"铅笔pencil使用完毕....");
            }
            System.out.println(name+"线程执行完毕!!!!!!!!!!!!!!!!");
        }else {//非小明线程执行
          //小红线程要使用铅笔和橡皮对象(通过同步锁将这两个对象锁起来)，使用的顺序和小明线程相反
            synchronized (rubber){
                System.out.println(name+"正在使用橡皮rubber....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //在此处小红线程准备使用铅笔对象
                synchronized (pencil){
                    System.out.println(name+"正在使用铅笔pencil....");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(name+"铅笔pencil使用完毕....");
                    //在小红线程将要执行完毕时，通过pencil对象唤醒小明线程
                    pencil.notifyAll();
                }
                System.out.println(name+"橡皮rubber使用完毕....");
            }
            System.out.println(name+"线程执行完毕!!!!!!!!!!!!!!!!");
        }
    }
}
