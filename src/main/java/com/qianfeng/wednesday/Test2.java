package com.qianfeng.wednesday;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask(new Callable() {
            @Override
            public String call() throws Exception {
                System.err.println("这个线程是由实现Callable实现的！");
                return "call线程已经运行完毕，请老大发号司令！";// call方法运行完毕之后，返回值
            }
        });
        futureTask.run();// 开启线程，让线程处于就绪状态！
        String res = futureTask.get();// 获取线程执行完毕之后的返回值，一直会等到结果出来，才会离开，才会继续往后执行
        System.err.println("线程运行完毕之后的返回值是："+res);// 也就是说FutureTask是包含了线程运行完毕的一个状态
    }
}
