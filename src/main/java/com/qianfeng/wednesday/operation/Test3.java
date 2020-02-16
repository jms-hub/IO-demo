package com.qianfeng.wednesday.operation;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 作者：黎杭
 * 日期：2020/2/13
 */
public class Test3 {

    /*   编写多线程应用程序，模拟多个人通过一个山洞的模拟。这个山洞每次只能通过一个人，
      每个人通过山洞的时间为5秒，随机生成10个人，同时准备过此山洞，显示一下每次通过山洞人的姓名*/
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //遍历集合
        List<String> names = new ArrayList<>();
        names.add("1");
        names.add("2");
        names.add("3");
        names.add("4");
        names.add("5");
        names.add("6");
        names.add("7");
        names.add("8");
        names.add("9");
        names.add("10");
        for (int i = 0; i < 10; i++) {
            FutureTask futureTask = new FutureTask(new Callable() {
                @Override
                public Boolean call() throws Exception {
                    try {
                        System.out.println(Thread.currentThread().getName() + "开始过山洞了");
                        Thread.sleep(5000);// 过山洞需要5秒
                        System.out.println(Thread.currentThread().getName() + "过了山洞");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return true;// 其实返回什么不重要
                }
            });
            //把每个人的名字当成线程名
            int m = (int) (Math.random() * names.size());// 获取0-9的数字
            String s = names.get(m);// 获取随机的人的名字
            // 应该把这个集合里边这个取出来的人移除掉，移除集合里边的元素用什么？
//            names.remove(s);// 能行吗？ // 不行的，
            Iterator<String> iterator = names.iterator();// 迭代器删除
            while (iterator.hasNext()) {
                String next = iterator.next();
                if (next.equals(s)) {//
                    iterator.remove();// 如果名字相等，我就移除这个元素
                }
            }
            Thread thread = new Thread(futureTask, "人" + s);
            thread.start();// 开启线程
            futureTask.get();// 获取当前人是否过完山洞的结果
            // get方法在获取结果的时候，线程是处于阻塞状态
            // 其实在这里用这种方法其实是偷工减料了
        }
    }
}
