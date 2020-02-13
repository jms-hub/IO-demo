package com.qianfeng.thursday;


/**
 * 作者：黎杭
 * 日期：2020/2/13
 * <p>
 * 模拟快递哥时时刻刻给小明送娃娃
 */
public class Test9 {

    public static void main(String[] args) {
        Doll doll = new Doll();
        Producer producer = new Producer(doll);// 如果当线程运行起来，那么这个娃娃就有了名字和体重还有身高了，此时doll就拥有了这些属性
        Consumer consumer = new Consumer(doll);// 此时如果小明去快递柜取出娃娃，那么就应该是同一个娃娃

        Thread thread1 = new Thread(producer, "快递哥");// 创建出快递哥送快递的线程
        Thread thread2 = new Thread(consumer, "小明");
        ;// 创建出小明取快递的线程

        thread1.start();// 让两个线程处于 就绪状态
        thread2.start();




    }
}
