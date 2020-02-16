package com.qianfeng.friday;


import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 作者：黎杭
 * 日期：2020/2/14
 * 这个类是用来测试IP地址类的一个测试类。用于学习IP地址类
 */
public class InetAddressTest2 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress[] inetAddress = InetAddress.getAllByName("www.baidu.com");// 通过静态方法获取InetAddress实例
        System.err.println("获取到的地址有" + inetAddress.length + "个");
        for (InetAddress i : inetAddress) {
            System.err.println("名称是：" + i.getHostName());
            System.err.println("ip是" + i.getHostAddress());
        }
    }
}
