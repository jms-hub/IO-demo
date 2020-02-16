package com.qianfeng.thursday.operation;


/**
 * 作者：黎杭
 * 日期：2020/2/14
 */
public class Test {
    public static void main(String[] args) {
        Barrel barrel = new Barrel();
        /**
         * 当射出子弹速度没有装得快的时候，缓冲区12颗子弹就会装满
         * 当子弹射出的速度比装的快的时候，枪膛就装不满
         * 时间可以自定义，测试看看效果
         */
        Producer producer = new Producer(barrel, 1000);// 装子弹
        Consumer consumer = new Consumer(barrel, 1500);// 射出子弹

        Thread thread1 = new Thread(producer, "装子弹");
        Thread thread2 = new Thread(consumer, "射子弹");

        thread1.start();
        thread2.start();
    }
}
