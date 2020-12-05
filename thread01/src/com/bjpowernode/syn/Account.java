package com.bjpowernode.syn;

/**
 * 银行账户
 */
public class Account {
    private int accID;
    private String accName;
    private double balance;
    /**
     * 取款的方法：取款的金额必须大于等于余额
     *
     * 线程同步：在同一时间内，同一块代码只允许一个线程执行
     * 线程同步的情况下就不会产生线程并发。
     * 怎么完成线程同步：就是将有可能出现安全问题的代码，添加一个线程锁。
     *
     * 方式一：局部锁，区域锁(有可能造成死锁)
     *      synchronized(同步监视器对象){
     *          该局部锁将有可能出现线程安全问题代码添加一个锁
     *      }
     *  同步监视器对象:原则上是所有的对象都可以。
     *              实际在使用时要特别注意：
     *                      该对象针对所有的线程都必须是同一个对象。如果多个线程执行时 不是同一个对象，锁就会失效，
     *                      两个线程可以一块执行。
     *               该段代码的执行过程：张三线程启动执行该方法，张三线程会将这段代码锁定，在张三线程执行期间不允许其他线程
     *               执行，其他线程在这块区域之外等待，等待张三线程执行完毕，才可执行；
     *
     *               对于监视器对象的写法：
     *                  一般情况下，方法是非静态方法中的锁对象使用this对象
     *                              方法是静态方法中的锁对象是 类名.class
     *  优点：可以更精确的锁定某一段代码，提高执行效率
     *
     * 方式二:方法锁，功能锁
     *          在方法定义时，直接使用关键字synchronized修饰方法，该方法的所有内容都是线程同步的代码；
     *
     *          方法是非静态方法中的锁对象固定的this对象
     *          方法是静态方法中的锁对象固定的是 类名.class
     *
     *   缺点：会将整个方法线程同步，有可能某些代码并不会产生线程安全问题
     */
    public synchronized void withDraw(double money){
//        synchronized (this){
            if(balance >= money){
                //在此处让每一个进入的线程进行一个短暂的休眠
                //破坏了代码的完整性，判断和金额的扣除是一个整体，是不可分割的
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance-=money;
                System.out.println(Thread.currentThread().getName()+"取款成功");
            }else{
                System.out.println(Thread.currentThread().getName()+"取款失败，余额不足");
            }
//        }

        System.out.println("程序结束");
    }
    public Account() {
    }

    public Account(int accID, String accName, double balance) {
        this.accID = accID;
        this.accName = accName;
        this.balance = balance;
    }

    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
