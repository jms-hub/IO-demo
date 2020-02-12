package com.qianfeng.wednesday;

public class Test9 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 100; x++) {
                    System.err.println("男同学线程是：" + Thread.currentThread().getName() + ",x=" + x);
                    if (x % 3 == 0) {// 当x是3的倍数的时候，就做出让步
                        Thread.yield();// 做出让步，其实就是让当前线程暂停一下，CPU重新进行选择线程执行。
                        // 让步不能等于阻塞,如果这个线程让步的话，它会立刻进入就绪状态，等待CPU执行时间的到来。
                    }
                }
            }
        };
        Thread boy = new Thread(runnable, "男同学线程");

        Thread girl = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 100; x++) {
                    System.err.println("女同学线程是：" + Thread.currentThread().getName() + ",x=" + x);
                }
            }
        }, "女同学的线程");
        boy.start(); // 开启男生的线程
        girl.start();// 开启女生的线程
    }
}
