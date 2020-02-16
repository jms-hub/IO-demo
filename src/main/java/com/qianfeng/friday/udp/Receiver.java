package com.qianfeng.friday.udp;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 作者：黎杭
 * 日期：2020/2/14
 * <p>
 * UDP的数据接收端
 */
public class Receiver {

    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(9527);// 定义一个UDP socket

        byte[] bytes = new byte[1024];// 准备一个字节数组拿来存放接收到的数据
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);// 定义一个数据包去存放接收到的数据

        datagramSocket.receive(datagramPacket);// 接收数据包的数据，存到定义好的数据包里边

        System.err.println("哈哈哈");
        byte[] data = datagramPacket.getData();// 从数据包里边把数据取出来

        System.err.println("收到的数据是：" + new String(data));// 把数据字节变成字符串输出

    }

}
