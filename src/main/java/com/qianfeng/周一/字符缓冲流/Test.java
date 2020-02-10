package com.qianfeng.周一.字符缓冲流;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        File file1 = new File("T:" + File.separator + "2020年春逆战" + File.separator + "第一周-IO、多线程、网络通信\\1-IO-1", "test.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
        String s = bufferedReader.readLine();// 读取一行数据
        System.err.println(s);
        String s1 = bufferedReader.readLine();// 读取一行数据
        System.err.println(s1);
    }
}
