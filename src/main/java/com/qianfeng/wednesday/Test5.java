package com.qianfeng.wednesday;

import java.util.concurrent.*;

public class Test5 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 100; x++) {
                    System.err.println("当前的线程是:" + Thread.currentThread().getName() + ",x=" + x);
                    try {
                        Thread.sleep(1000);// 让这个线程昏睡1秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "线程A").start();// 开启线程
    }
}
