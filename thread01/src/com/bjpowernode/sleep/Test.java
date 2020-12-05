package com.bjpowernode.sleep;

import com.bjpowernode.priority.MyPriority;

public class Test {
    public static void main(String[] args) {
        MySleep mySleep = new MySleep("休眠的线程一");
        mySleep.start();

        MySleep mySleep2 = new MySleep("休眠的线程二");
        mySleep2.start();
    }
}
