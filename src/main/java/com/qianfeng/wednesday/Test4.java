package com.qianfeng.wednesday;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 1000; x++) {
                    if (x % 3 == 0) {
                        Thread.yield();
                        System.err.println("线程礼让" + Thread.currentThread().getName()+x);
                    }
                    try {
                        Thread.sleep(2000);
                        System.err.println("线程"+Thread.currentThread().getName()+"x="+x);
                    } catch (InterruptedException e) {


                    }

                }

            }
        }).start();

        for(int x=0;x<1000;x++){
            Thread.sleep(2000);
            System.err.println(Thread.currentThread().getName()+"x="+x);
        }


    }
}
