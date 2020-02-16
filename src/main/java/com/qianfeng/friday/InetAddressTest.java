package com.qianfeng.friday;


import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 作者：黎杭
 * 日期：2020/2/14
 * 这个类是用来测试IP地址类的一个测试类。用于学习IP地址类
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("www.baidu.com");// 通过静态方法获取InetAddress实例
        System.err.println("主机的地址是：" + inetAddress.getHostAddress());
        System.err.println("主机的域名：" + inetAddress.getCanonicalHostName());
        System.err.println("主机的名称：" + inetAddress.getHostName());
    }
}
