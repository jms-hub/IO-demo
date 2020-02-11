package com.qianfeng.wednesday;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("线程-张三");
        myThread.start();
    }
}
