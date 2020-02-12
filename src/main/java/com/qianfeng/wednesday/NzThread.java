package com.qianfeng.wednesday;


public class NzThread extends Thread {
    @Override
    public void run() {// 覆写了这个run方法，run方法实际就是指的是线程真正要做的事情
        for (int x = 0; x < 101; x++) {
            System.err.println("图片下载了" + x + "%");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
