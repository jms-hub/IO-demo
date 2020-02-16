package com.qianfeng.friday.socket.demo1;


import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 作者：黎杭
 * 日期：2020/2/14
 * 这个类是进行服务器端Socket通信代码的展示
 * 这个服务器端就当女生
 */
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9876);// 建立一个服务器监听Socket的 实例
        System.err.println("等待客户端进行连接...");
        Socket accept = serverSocket.accept();// 这个方法就是等待客户端连接，这个等待也是死等（阻塞）的等，等到之后，就得到Socket对象，就能够和客户端进行通信了
        InputStream inputStream = accept.getInputStream();// 获取客户端传来的数据，以字节输入流的形式


        byte[] bytes = new byte[8192];// 开辟一个字节数组，用来保存输入流中读取出来的字节
        int len = inputStream.read(bytes);// 读取到的数据保存在bytes数组里边，并返回实际读到的字节长度

        System.err.println("客户端传来的消息是：" + new String(bytes, 0, len));// 将字节数组变成字符串输出

//        inputStream.close();
//        accept.close();
    }
}
