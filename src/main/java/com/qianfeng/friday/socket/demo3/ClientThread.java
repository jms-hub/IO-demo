package com.qianfeng.friday.socket.demo3;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 作者：黎杭
 * 日期：2020/2/14
 * <p>
 * 这个是创建客户端聊天线程的类
 */
public class ClientThread implements Runnable {
    private Socket socket;
    public ClientThread(Socket socket) {
        this.socket = socket;// 把外面传的Socket赋值到本类的Socket
    }
    @Override
    public void run() {// 写聊天的内容了
        InputStream inputStream = null;// 获取客户端传来的数据，以字节输入流的形式
        try {
            inputStream = socket.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(inputStream);// 创建扫描流
        OutputStream outputStream = null;// 取出输出流
        try {
            outputStream = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
    }
}
