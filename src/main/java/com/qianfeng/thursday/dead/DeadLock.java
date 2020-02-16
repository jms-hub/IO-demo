package com.qianfeng.thursday.dead;


/**
 * 作者：黎杭
 * 日期：2020/2/13
 */
public class DeadLock implements Runnable {

    static Object lock1 = new Object();// 定义第1把锁
    static Object lock2 = new Object();// 定义第2把锁


    @Override
    public void run() {
        method1();// 调用方法1
        method2();// 调用方法2
    }

    public void method2() { // 这个是方法2
        synchronized (lock2) {// 方法2先去抢第二把锁
            System.err.println("方法2抢到了第2把锁" + Thread.currentThread().getName());
            synchronized (lock1) {
                System.err.println("方法2抢到了第1把锁" + Thread.currentThread().getName());
            }
        }
    }

    public void method1() {// 这个是方法1
        synchronized (lock1) {// 方法1首先把 第一把锁抢到，抢到之后就大声说：我抢到第一把锁了
            System.err.println("方法1抢到了第1把锁" + Thread.currentThread().getName());
            synchronized (lock2) {// 方法1还不满足，还想继续抢第二把锁
                // 当lock2释放之后，也就是"方法1抢到了第2把锁"这句代码输出之后，
                System.err.println("方法1抢到了第2把锁" + Thread.currentThread().getName());
            }
        }
    }
}
