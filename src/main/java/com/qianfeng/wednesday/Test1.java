package com.qianfeng.wednesday;

public class Test1 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 1000; x++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.err.println(Thread.currentThread().getName() + "在运行" + x);
                }
            }
        };

        Thread thread1 = new Thread(runnable,"线程A");
        thread1.setPriority(1);
        Thread thread2 = new Thread(runnable,"线程B");
        thread2.setPriority(10);

        Thread thread3 = new Thread(runnable,"线程C");
        thread3.setPriority(5);
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
