package com.qianfeng.friday.socket.demo1;


import java.io.OutputStream;
import java.net.Socket;

/**
 * 作者：黎杭
 * 日期：2020/2/14
 * <p>
 * 这个类表示Socket通信中的客户端程序，今天就表示帅哥
 */
public class Client {

    public static void main(String[] args) throws Exception {
        // 需要传递两个参数，第一个参数是服务器的ip地址对象，第二个参数是传递服务器的端口号
        // 本机的ip地址是多少？ 127.0.0.1
        Socket socket = new Socket("127.0.0.1", 9876);// 拿到Socket,就可以和服务器进行通信了

        OutputStream outputStream = socket.getOutputStream();// 获取到输出流，准备用输出流去发消息
        outputStream.write("今天情人节，你累吗？".getBytes());// 把消息写入到输出流

        outputStream.flush();// 强制从缓冲区输出内容

//        outputStream.close();// 关闭流
//
//        socket.close();// 关闭Socket通信
    }
}
