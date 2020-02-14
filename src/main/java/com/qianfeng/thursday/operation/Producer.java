package com.qianfeng.thursday.operation;


import com.qianfeng.thursday.producer.Doll;

/**
 * 作者：黎杭
 * 日期：2020/2/13
 */
public class Producer implements Runnable {
    private Barrel barrel;// 枪膛
    private long time;//装1颗子弹是速度

    public Producer(Barrel barrel,long time) {// 外界把枪膛传进来
        this.barrel = barrel;
        this.time=time;
    }

    @Override
    public void run() {
        while (true) {// 一直装子弹
            try {
                Thread.sleep(time);// 装1颗子弹需要1秒
                barrel.addBullet(new Bullet());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
