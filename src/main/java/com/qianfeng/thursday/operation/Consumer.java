package com.qianfeng.thursday.operation;

import com.qianfeng.thursday.producer.Doll;

/**
 * 作者：黎杭
 * 日期：2020/2/13
 * 这个线程去射击子弹
 */
public class Consumer implements Runnable {
    private Barrel barrel;// 外界传递枪膛
    private long time;// 射出子弹的速度

    public Consumer(Barrel barrel, long time) {// 外界传入娃娃
        this.barrel = barrel;
        this.time = time;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(time);// 射出子弹假如需要500毫秒
                barrel.shootingBullet();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
