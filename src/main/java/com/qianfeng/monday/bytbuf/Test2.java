package com.qianfeng.monday.bytbuf;


import java.io.*;

public class Test2 {
    public static void main(String[] args) throws Exception {
        File file1 = new File("T:" + File.separator + "2020年春逆战" + File.separator + "第一周-IO、多线程、网络通信\\1-IO-1", "test.txt");

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file1));
        // 缓冲区默认是8k大小，没有达到的话，是不会进行和输出的，所以咱们需要手工输出一下
        bufferedOutputStream.write("各位小伙伴们，你们真好看！".getBytes());

        bufferedOutputStream.flush();// 强制更新缓冲区，强制输出到指定位置
        bufferedOutputStream.close();// 手动关闭输出流


    }
}
