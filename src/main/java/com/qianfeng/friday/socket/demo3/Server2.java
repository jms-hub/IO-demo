package com.qianfeng.friday.socket.demo3;


import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 作者：黎杭
 * 日期：2020/2/14
 * 这个类是进行服务器端Socket通信代码的展示
 * 这个服务器端就当女生
 */
public class Server2 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9876);// 建立一个服务器监听Socket的 实例
        System.err.println("等待客户端进行连接...");
        // 从这里开始，其实就要进行多线程处理操作，也就是让每一个线程去管理自己的Socket
        while (true) {// 用while循环还是for
            // 当有一个新的客户端连接成功的时候，就需要给这个客户端创建一个线程
            Socket accept = serverSocket.accept();// 这个方法就是等待客户端连接，这个等待也是死等（阻塞）的等，等到之后，就得到Socket对象，就能够和客户端进行通信了
            // 是否会有问题？ serverSocket.accept() 这个方法是（阻塞）的，当没用客户端连接进来的时候，
            // 这个Socket实例 代表的与服务器和每个客户端通信对象，那么应该把这个对象，传给每个线程去使用
            new Thread(new ClientThread(accept)).start();
        }
//        inputStream.close();
//        accept.close();
    }
}
