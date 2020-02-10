package com.qianfeng.周一.转换流;


import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        File file1 = new File("T:" + File.separator + "2020年春逆战" + File.separator + "第一周-IO、多线程、网络通信\\1-IO-1", "test.txt");
        InputStream fileInputStream = new FileInputStream(file1);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);// 得到转换流
        char[] chars = new char[1024];
        int len = inputStreamReader.read(chars);
        System.err.println(new String(chars, 0, len));
    }
}
