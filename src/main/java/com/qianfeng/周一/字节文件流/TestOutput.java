package com.qianfeng.周一.字节文件流;


import java.io.File;
import java.io.FileOutputStream;

public class TestOutput {

    public static void main(String[] args) throws Exception {
        File file1 = new File("T:" + File.separator + "2020年春逆战" + File.separator + "第一周-IO、多线程、网络通信\\1-IO-1", "test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file1, true);// 默认为覆盖原文件进行输出操作
        fileOutputStream.write("逆战1902必胜！".getBytes());
    }

}
