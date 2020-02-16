package com.qianfeng.thursday.producer;

/**
 * 作者：黎杭
 * 日期：2020/2/13
 */
public class Consumer implements Runnable {
    private Doll doll;// 这个娃娃也是需要外界传进来的，也就是快递哥送过来的
    public Consumer(Doll doll) {// 外界传入娃娃
        this.doll = doll;
    }
    @Override
    public void run() {
        for (int x = 0; x < 100; x++) {
            doll.getInfo();
        }
    }
}
