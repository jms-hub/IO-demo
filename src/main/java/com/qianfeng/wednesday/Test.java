package com.qianfeng.wednesday;

public class Test {
    public static void main(String[] args) {// main方法是主线程
        NzThread nzThread = new NzThread();// 创建自定义的一个线程
        nzThread.setName("逆战线程");// 设置线程的名称
        nzThread.start();//  调用start方法，让线程就绪
        System.err.println(nzThread.getName());
        System.err.println("主线程的名称：" + Thread.currentThread().getName());
    }
}
