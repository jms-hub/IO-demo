package com.qianfeng.wednesday;

import java.util.concurrent.*;

public class Test3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();// 创建一个缓存线程池，自动根据需要来扩充线程大小
//        Executors.newFixedThreadPool(5);// 创建一个固定线程池大小的线程池
//        Executors.newScheduledThreadPool(100);// 创建一个 包含100个线程的定时任务线程池
//        Executors.newSingleThreadExecutor();// 创建单个线程的线程池
//        Executors.newWorkStealingPool();// 根据工作状态，系统创建线程池

        executorService.execute(new Runnable() {// 执行一个线程，不用start方法，并且没有返回值
            @Override
            public void run() {
                // 其实在这里要做的是，你业务的真正逻辑。
                // 好几千万的订单数据，凭证数据，同步到金蝶（财务）系统，需要很长的时间
                System.err.println("我是Executors创建出来的线程！");

            }
        });
        Future<Object> submit = executorService.submit(new Callable<Object>() {
            @Override
            public String call() throws Exception {
                System.err.println("我是submit方法执行的线程的内容");
                // 至于说返回什么对象，要看你实际的情况
                return "call线程运行完毕";
            }
        });
        Object o = submit.get();// 得到线程运行完毕的结果
        System.err.println(o);// 输出结果
    }
}
