package com.qianfeng.thursday.operation;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 作者：黎杭
 * 日期：2020/2/14
 * 枪膛类，装子弹用的
 */
public class Barrel {
    List<Bullet> list = new ArrayList<>();

    // 装子弹
    public synchronized void addBullet(Bullet bullet) {// 同时，把此方法设置为同步方法
        if (list.size() < 12) {//  枪膛还能装子弹
            list.add(bullet);
            System.err.println("新增1颗子弹" + bullet + "目前枪膛中的子弹为" + list.size() + "颗");// 直接输出子弹
            super.notifyAll();// 唤醒射击，去射子弹
        } else {// 子弹已经装满
            System.err.println("子弹已经装满，等待发射");
            try {
                super.wait();// 调用父类的等待方法，一直死等，必须等到 唤醒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 射出子弹
    public synchronized void shootingBullet() {// 取出娃娃
        if (list.size() > 0) {// 枪膛里边有子弹
            Iterator<Bullet> iterator = list.iterator();
            while (iterator.hasNext()) {
                Bullet next = iterator.next();
                System.err.println("射出1子弹：" + next);
                iterator.remove();// 射出全部子弹
                break;// 一次只射出一颗
            }
            super.notifyAll();// 通知快递哥，赶紧给我继续送娃娃

        } else {

            System.err.println("子弹已经射完，等待装子弹");
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}
