package com.qianfeng.thursday;


import lombok.Data;

/**
 * 作者：黎杭
 * 日期：2020/2/13
 * 模式数据，就是来自日本的娃娃
 */
@Data
public class Doll {
    // 娃娃的名字
    private String name;
    // 娃娃的身高
    private Integer height;
    // 娃娃的体重
    private Double weight;

    private Boolean flag = true;// 默认是true,表示快递哥能存娃娃，false表示快递哥需要进行等待操作

    // 存娃娃
    public synchronized void setInfo(String name, Integer height, Double weight) {// 同时，把此方法设置为同步方法
        if (flag) {// 如果flag是true,能存娃娃
            this.name = name;
            this.height = height;
            this.weight = weight;
            try {
                Thread.sleep(1000);// 假设快递哥把娃娃放进快递柜是需要1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.err.println("快递已经把娃娃放到柜子里边了" + this);// 直接输出this
            // 已经把娃娃放进去了
            flag = false;// 就不能再存了
            // 这个时候需要通知小明把娃娃取走
            super.notifyAll();// 唤醒别的处于等待中的线程，小明在等娃娃
        } else {// 不能存表示快递柜已经有娃娃了，那么这个时候，快递哥就需要进行等待操作
            System.err.println("快递哥在等待小明取走娃娃");
            try {
                super.wait();// 调用父类的等待方法，一直死等，必须等到 唤醒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 取娃娃
    public synchronized void getInfo() {// 取出娃娃
        if (flag) {// 能存的时候，小明则需要进行等待操作
            System.err.println("小明正在饥渴难耐的等待娃娃");
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("小明取走了娃娃：" + this);
            flag = true;// 取走娃娃之后，改变快递柜的状态为可以存了
            super.notifyAll();// 通知快递哥，赶紧给我继续送娃娃
        }
    }
}
