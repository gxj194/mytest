package com.bjpowernode.join;

import com.bjpowernode.sleep.MySleep;

public class Test {
    public static void main(String[] args) {
        TuZi tuZi = new TuZi();
        WuGui wuGui = new WuGui();


        tuZi.setName("兔子");
        wuGui.setName("乌龟");

        //赋值
        tuZi.wuGui = wuGui;
        wuGui.tuZi = tuZi;

        tuZi.start();
        wuGui.start();
    }
}
