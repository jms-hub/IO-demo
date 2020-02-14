package com.qianfeng.friday.udp;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 作者：黎杭
 * 日期：2020/2/14
 * UDP编程发送端代码测试
 * 发送端代码就写完了
 */
public class Sender {

    public static void main(String[] args) throws Exception {

        DatagramSocket datagramSocket = new DatagramSocket();
        /**
         * 从此套接字发送一个数据报包。
         * *{@code DatagramPacket}包含以下信息：*1要发送的数据，2其长度，3远程主机的IP地址，*
         * 和远程主机上的4端口号
         */
        byte[] data = "发个照片试试".getBytes();// 第一个参数，是数据

        // 第二个参数是数据的长度
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");// 获取到第三个参数
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length, inetAddress, 9527);
        datagramSocket.send(datagramPacket);//
    }
}
