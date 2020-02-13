package com.qianfeng.thursday;

import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 这个类模仿 1000个人去抢购100张票的案例
 * 此时我们使用同步静态方法，去解决临界资源产生的问题
 */
public class Test5 {


    static int tickets = 100;// 默认这个火车票是100张，临界资源
    static ReentrantLock reentrantLock = new ReentrantLock();// 创建一个重入锁
    static Runnable runnable = new Runnable() {// 它匿名内部类
        @Override
        public void run() {// 这个方法里边就是写真正的售票逻辑
            reentrantLock.lock();// 从这里开始，往下执行的代码，进行上锁操作，也就是别的线程在没有解锁之前，是无法访问的
            try {
                if (tickets > 0) {// 还有火车票,假如说此时的票还有 1张
                    try {
                        // 当代码执行到沉睡的时候，CPU执行时间被别的线程抢走了，那么还没有减去票的数量，那么其他的线程还是
                        // 能进入if语句，那么就会造成一下子减去很多票，导致业务逻辑不正确了
                        Thread.sleep(100);// 假设还有其他业务，比如订单远程上传，消耗时间0.1秒
                        tickets--;// 当前票数减1
                        // 假如在卖票的过程之中，抛出了异常，那么，锁怎么释放?
                        System.err.println("当前剩余火车票数为：" + tickets + "张");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {// 不管怎么样，都要释放这个锁，因为不放的话，其他线程永远也进不了，就导致程序错误了
                reentrantLock.unlock();// 对以上代码进行解锁，此时其他线程又可以进行抢占CPU执行时间了
            }
        }
    };

    public static void main(String[] args) {
        for (int x = 0; x < 1000; x++) {
            new Thread(runnable, "抢票人" + x).start();
        }
    }
}
