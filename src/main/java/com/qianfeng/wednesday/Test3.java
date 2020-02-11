package com.qianfeng.wednesday;

import java.util.concurrent.*;

public class Test3 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.err.println("我是Executors创建出来的线程");
            }
        });

        Future<?> hahah = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.err.println("hahah");
            }
        });
        Future<Object> test = executorService.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.err.println("县城能否执行");
                return "线程执行完毕";
            }
        });


    }
}
