package com.qianfeng.friday.socket.demo2;


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
public class Server1 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9876);// 建立一个服务器监听Socket的 实例
        System.err.println("等待客户端进行连接...");
        // 从这里开始，其实就要进行多线程处理操作，也就是让每一个线程去管理自己的Socket
        Socket accept = serverSocket.accept();// 这个方法就是等待客户端连接，这个等待也是死等（阻塞）的等，等到之后，就得到Socket对象，就能够和客户端进行通信了
        InputStream inputStream = accept.getInputStream();// 获取客户端传来的数据，以字节输入流的形式
        Scanner scanner = new Scanner(inputStream);// 创建扫描流
        OutputStream outputStream = accept.getOutputStream();// 取出输出流
        PrintStream printStream = new PrintStream(outputStream);// 创建打印流输出
        boolean flag = true;// 如果是true,表示帅哥和美女还在聊天
        while (flag) {
            if (scanner.hasNext()) {

                String msg = scanner.next();
                System.err.println("【帅哥】" + msg);
                // 美女也要进行回复
                printStream.println("有空啊,哥哥，咱们去哪？");
                printStream.flush();// 强制输出以下
                if ("多喝开水".equals(msg)) {
                    flag = false;
                }
            }
        }
//        inputStream.close();
//        accept.close();
    }
}
