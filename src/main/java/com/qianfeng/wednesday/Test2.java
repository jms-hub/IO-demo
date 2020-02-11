package com.qianfeng.wednesday;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        FutureTask<String> futureTask = new FutureTask(new Callable() {
            @Override
            public String call() throws Exception {

                System.err.println("这个一个Callable实现的线程");

                return "线程名字-王五已经执行完毕，请长官发号司令！";
            }
        });
        futureTask.run();
        String s = futureTask.get();
        System.err.println("线程运行完之后的返回值："+s);


    }
}
