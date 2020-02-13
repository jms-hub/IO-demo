package com.qianfeng.thursday.single;


import java.util.HashSet;
import java.util.Set;

/**
 * 作者：黎杭
 * 日期：2020/2/13
 * <p>
 * 测试多线程访问饿汉式单例模式，查看是否有问题
 */
public class Test8 {
    public static void main(String[] args) {
        Set<User1> set = new HashSet<>();// 第一个为什么要set? set有什么特点？ 自动去掉相同内容（元素）
        for (int x = 0; x < 100; x++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    User1 user1 = User1.getInstance();// 获取user的实例
                    set.add(user1);
                }
            }).start();
        }
        System.err.println(set);
    }
}
