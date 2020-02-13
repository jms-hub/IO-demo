package com.qianfeng.thursday.producer;

import com.qianfeng.thursday.Doll;

/**
 * 作者：黎杭
 * 日期：2020/2/13
 * 模拟快递哥送快递的线程
 */
public class Producer implements Runnable {
    private Doll doll;// 因为要达到 快递哥送一个玩具，就时小明买的那个玩具，那么这个玩具，就必须是外界传进来
    public Producer(Doll doll) {// 外界把娃娃传进来
        this.doll = doll;
    }
    @Override
    public void run() {
        for (int x = 0; x < 100; x++) {
            doll.setInfo("小泽苍" + x, 168, 42.5);
        }
    }
}
