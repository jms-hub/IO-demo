package com.qianfeng.周二.随意访问文件类;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class Test {
    public static void main(String[] args) throws Exception {

        RandomAccessFile randomAccessFile = new RandomAccessFile(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\test.txt"), "rw");
        // 如果是首次打开文件，那么指针位置是 0
        System.err.println("文件当前指针位置：" + randomAccessFile.getFilePointer());


        int l = "随便".getBytes().length;// 跳过随便两个字节的长度
        randomAccessFile.skipBytes(l);
        byte[] bytes = new byte[1024];
        randomAccessFile.seek(4);// 把光标移动到指定位置
        int len = randomAccessFile.read(bytes);
        System.err.println("读到的是：" + new String(bytes, 0, len));
        System.err.println("文件当前指针位置：" + randomAccessFile.getFilePointer());
        // 为什么会乱码，由于咱们跳过是10个字节，但是汉字可能2，3个字节，可能正好跳过了一个半的字
        randomAccessFile.close();


    }
}
