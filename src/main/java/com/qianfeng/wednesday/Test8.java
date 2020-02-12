package com.qianfeng.wednesday;

public class Test8 {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 100; x++) {
                    System.err.println("当前线程是：" + Thread.currentThread().getName() + ",x=" + x);
                    try {
                        Thread.sleep(1000);// 让线程昏睡1秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "守护线程");
        daemonThread.setDaemon(true);// 把这个线程设置为守护状态，也就是说把这个线程设置成守护线程
        daemonThread.start();// 跑起来这个线程
        for (int x = 0; x < 100; x++) {
            System.err.println("当前线程是：" + Thread.currentThread().getName() + ",x=" + x);
        }
    }
}
