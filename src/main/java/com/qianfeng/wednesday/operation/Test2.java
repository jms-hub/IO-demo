package com.qianfeng.wednesday.operation;


import java.util.ArrayList;

/**
 * 作者：黎杭
 * 日期：2020/2/13
 */
public class Test2 {

    /*   编写多线程应用程序，模拟多个人通过一个山洞的模拟。这个山洞每次只能通过一个人，
      每个人通过山洞的时间为5秒，随机生成10个人，同时准备过此山洞，显示一下每次通过山洞人的姓名*/
    public static void main(String[] args) {
        //表示十个人
        ArrayList<String> list = new ArrayList<String>();
        list.add("一一");
        list.add("二二");
        list.add("三三");
        list.add("四四");
        list.add("五五");
        list.add("六六");
        list.add("七七");
        list.add("八八");
        list.add("九九");
        list.add("十十");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized ("") {// 使用字符串当个对象锁，进行过山洞同步
                    try {
                        System.out.println(Thread.currentThread().getName() + "开始过山洞了");
                        Thread.sleep(5000);// 过山洞需要5秒
                        System.out.println(Thread.currentThread().getName() + "过了山洞");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //遍历集合
        for (int i = 0; i < 10; i++) {
            //把每个人的名字当成线程名
            Thread thread = new Thread(runnable, list.get(i));
            thread.start();
        }
    }
}
