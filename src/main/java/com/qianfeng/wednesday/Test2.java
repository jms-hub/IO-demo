package com.qianfeng.wednesday;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable callable = new Callable() {
            @Override
            public String call() throws Exception {
                for (int x = 0; x < 101; x++) {
                    System.err.println("迅雷便下载边看" + x + "%");
                    System.err.println(Thread.currentThread().getName());
                    Thread.sleep(50);// 沉睡0.1秒
                }
                return "call线程已经运行完毕，请老大发号司令！";// call方法运行完毕之后，返回值
            }
        };
        FutureTask<String> futureTask = new FutureTask(callable);
//        futureTask.cancel(true);// 取消线程
//        futureTask.run();// 开启线程，让线程处于就绪状态！
       Thread thread1= new Thread(futureTask);// 开启新线程
       thread1.start();
       Thread.sleep(3000);
        futureTask.cancel(true);// 取消线程

        String res = futureTask.get();// 获取线程执行完毕之后的返回值，一直会等到结果出来，才会离开，才会继续往后执行
        // 思考：假如我现在要取消这个线程，能否再get()方法后面设置？
        System.err.println("线程运行完毕之后的返回值是：" + res);// 也就是说FutureTask是包含了线程运行完毕的一个状态
        System.err.println("后面的是否输出");
        System.err.println("线程是否被取消？" + futureTask.isCancelled());
        System.err.println("线程是已完成？" + futureTask.isDone());
    }
}
