package com.qianfeng.wednesday;

public class Test6 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
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
        };
        Thread t1 = new Thread(runnable, "线程A");// 创建一个A线程
        Thread t2 = new Thread(runnable, "线程B");// 创建一个B线程
        Thread t3 = new Thread(runnable, "线程C");// 创建一个C线程
        t1.setPriority(1);// 线程的优先级是 （1-10）,线程优先级高的，并不是就一定先执行。
        t2.setPriority(5);// 优先级低的线程，还是始终会运行的，因为优先级高的线程运行完毕之后，就没线程跟它抢
        t3.setPriority(10);// t3的优先级是最高的，所以t3最有可能抢到CPU执行时间
        t1.start();
        t2.start();
        t3.start();
        System.err.println("主线程的优先级：" + Thread.currentThread().getPriority());
    }
}
