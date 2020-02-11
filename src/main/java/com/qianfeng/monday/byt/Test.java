package com.qianfeng.monday.byt;


import java.io.*;

public class Test {

    public static void main(String[] args) throws Exception {
        File file = new File("T:" + File.separator + "2020年春逆战" + File.separator + "第一周-IO、多线程、网络通信\\1-IO-1", "test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[1024];// 开辟一个数组空间，用来装数据
        int len = fileInputStream.read(bytes);// 读取数据到byte数组之中
        System.err.println(new String(bytes, 0, len));
    }

}
