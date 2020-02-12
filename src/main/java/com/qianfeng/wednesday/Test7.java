package com.qianfeng.wednesday;

public class Test7 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 100; x++) {
                    System.err.println("当前线程是：" + Thread.currentThread().getName() + ",x=" + x);
                    if (x == 10) {// 当x等10的时候，我加入一个新的线程进来
                        Thread joinThread = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                for (int y = 0; y < 10; y++) {
                                    System.err.println("插队线程：" + Thread.currentThread().getName() + ",y=" + y);
                                }
                            }
                        }, "插队线程B");
                        try {
                            joinThread.start();// 开启强制线程
                            joinThread.join();  // 强制加入
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }, "外部的线程").start();
    }
}
