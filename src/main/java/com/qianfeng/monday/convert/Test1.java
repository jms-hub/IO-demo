package com.qianfeng.monday.convert;


import java.io.*;

public class Test1 {
    public static void main(String[] args) throws Exception {
        File file1 = new File("T:" + File.separator + "2020年春逆战" + File.separator + "第一周-IO、多线程、网络通信\\1-IO-1", "test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);// 获取输出转换流
        outputStreamWriter.write("你来追我，追到我就让你嘿嘿嘿");// 只是输出到了缓冲区
        outputStreamWriter.flush();// 强制更新
        outputStreamWriter.close();// 关闭流之前，也会强制更新
    }
}
