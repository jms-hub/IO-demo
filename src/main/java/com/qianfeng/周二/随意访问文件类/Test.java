package com.qianfeng.周二.随意访问文件类;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class Test {
    public static void main(String[] args) throws Exception {
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\test.txt"), "rw");

        System.err.println("文件当前指针：" + randomAccessFile.getFilePointer());
//        randomAccessFile.write("张三".getBytes());
        byte[] bytes = new byte[1024];
        System.err.println("张三".getBytes().length);
        randomAccessFile.seek("张三".getBytes().length);// 跳过张三这么多字节的长度
        int len = randomAccessFile.read(bytes);
        System.err.println(new String(bytes));
        System.err.println("文件当前指针：" + randomAccessFile.getFilePointer());
        randomAccessFile.close();
    }
}
