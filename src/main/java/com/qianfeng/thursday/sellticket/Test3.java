package com.qianfeng.thursday.sellticket;

/**
 * 这个类模仿 1000个人去抢购100张票的案例
 * 此时我们使用同步非静态方法，去解决临界资源产生的问题
 */
public class Test3 {
    static int tickets = 100;// 默认这个火车票是100张，临界资源
    static Runnable runnable = new Runnable() {// 它匿名内部类
        @Override
        public void run() {// 这个方法里边就是写真正的售票逻辑
            // 调用卖票的方法
            sellTickets();// 进行卖票操作
        }
        // 定义一个同步非静态方法
        public synchronized void sellTickets() {
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
    };
    public static void main(String[] args) {
        for (int x = 0; x < 1000; x++) {
            new Thread(runnable, "抢票人" + x).start();
        }
    }
}
