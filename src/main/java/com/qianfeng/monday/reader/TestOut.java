package com.qianfeng.monday.reader;

import java.io.*;

public class TestOut {
    public static void main(String[] args) throws Exception {
        File file = new File("T:" + File.separator + "2020年春逆战" + File.separator + "第一周-IO、多线程、网络通信\\1-IO-1", "test.txt");
        Writer fileWriter = new FileWriter(file);
        fileWriter.write("今天咱们同学都做得很棒！特别的标记");// 实际上写到的缓冲区，根本还没有到磁盘，所以文件中是没有数据的！

        fileWriter.append("哇撒，竟然可以直接追加字符串呢！");

        // 第一种办法：flush()方法：强制更新缓冲区
//        fileWriter.flush();
        // 第二种办法;手动关闭流！因为在手动关闭流之前，会先更新缓冲区
        fileWriter.close();
    }


}
