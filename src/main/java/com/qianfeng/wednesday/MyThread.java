package com.qianfeng.wednesday;

public class MyThread extends Thread {


    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println("我就是一个崭新的线程:" + this.getName());
    }
}
