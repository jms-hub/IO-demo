package com.qianfeng.thursday;

/**
 * 这个类模仿 1000个人去抢购100张票的案例
 * 使用锁，解决这个多线程访问临界资源产生的问题，类锁
 */
public class Test2 {
    static int tickets = 100;// 默认这个火车票是100张，临界资源
    static Runnable runnable = new Runnable() {
        @Override
        public void run() {// 这个方法里边就是写真正的售票逻辑
            synchronized (Test2.class) {// 这个时候，用类锁去实现
                if (tickets > 0) {// 还有火车票,假如说此时的票还有 1张
                    try {
                        // 当代码执行到沉睡的时候，CPU执行时间被别的线程抢走了，那么还没有减去票的数量，那么其他的线程还是
                        // 能进入if语句，那么就会造成一下子减去很多票，导致业务逻辑不正确了
                        Thread.sleep(100);// 假设还有其他业务，比如订单远程上传，消耗时间0.1秒
                        tickets--;// 当前票数减1
                        System.err.println("当前剩余火车票数为：" + tickets + "张");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };
    public static void main(String[] args) {
        for (int x = 0; x < 1000; x++) {
            new Thread(runnable, "抢票人" + x).start();
        }
    }
}
