package com.qianfeng.wednesday;

public class Test1 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {// 创建一个Runnable的匿名实现类
            @Override
            public void run() {// 复写Run方法
                for (int x = 0; x < 101; x++) {
                    System.err.println("随堂视频上传：" + x + "%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable, "线程A");// 把Runnable实例传入Thread的构造函数
        thread.start();// 调用start方法，让线程处于就绪状态，等待CPU调用。
        System.err.println(thread.getName());// 输出线程的名称

        // 简洁版
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("简洁版Runnable实现多线程！");
            }
        }).start();


    }
}
