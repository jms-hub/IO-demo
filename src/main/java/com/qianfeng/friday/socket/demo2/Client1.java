package com.qianfeng.friday.socket.demo2;


import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 作者：黎杭
 * 日期：2020/2/14
 * <p>
 * 这个类表示Socket通信中的客户端程序，今天就表示帅哥
 */
public class Client1 {

    public static void main(String[] args) throws Exception {
        // 需要传递两个参数，第一个参数是服务器的ip地址对象，第二个参数是传递服务器的端口号
        // 本机的ip地址是多少？ 127.0.0.1
        System.err.println("正在连接服务器...");
        Socket socket = new Socket("127.0.0.1", 9876);// 拿到Socket,就可以和服务器进行通信了
        System.err.println("已和美女取得联系,请发消息");

        InputStream inputStream = socket.getInputStream();// 获取服务器传过来的数据
        Scanner scanner = new Scanner(inputStream);

        OutputStream outputStream = socket.getOutputStream();// 获取到输出流，准备用输出流去发消息
        PrintStream printStream = new PrintStream(outputStream);// 打印流，其实是装饰流

        Scanner keyScanner = new Scanner(System.in);// 键盘输入标准输入流

        boolean flag = true;// true的时候，就表示这个帅哥和美女还在聊天

        while (flag){
            if (keyScanner.hasNext()) {// 负责给美女发消息
                String msg = keyScanner.next();// 获取键盘输入的消息，也就是帅哥想给美女发的消息
                printStream.println(msg);// 本来是写死的，
                printStream.flush();// 强制从缓冲区输出内容
            }

            if (scanner.hasNext()) {// 这里就负责 美女传来的消息，
                System.err.println("【美女】" + scanner.next());
            }
        }



//        outputStream.close();// 关闭流
//
//        socket.close();// 关闭Socket通信
    }
}
