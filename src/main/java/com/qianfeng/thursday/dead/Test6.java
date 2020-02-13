package com.qianfeng.thursday.dead;


import com.qianfeng.thursday.dead.DeadLock;

/**
 * 作者：黎杭
 * 日期：2020/2/13
 * 测试死锁
 */
public class Test6 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DeadLock(), "线程1");
        t1.start();// 开启一个线程
        Thread t2 = new Thread(new DeadLock(), "线程2");
        t2.start();// 再开启一个线程
    }



}
