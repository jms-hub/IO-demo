package com.qianfeng.wednesday;

public class Test {
    public static void main(String[] args) {
        NzThread nzThread = new NzThread();// 创建自定义的一个线程
        nzThread.start();//  调用start方法，让线程就绪
    }
}
