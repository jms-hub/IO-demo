package com.qianfeng.monday.buf;


import java.io.*;

public class Test1 {
    public static void main(String[] args) throws Exception {
        File file1 = new File("T:" + File.separator + "2020年春逆战" + File.separator + "第一周-IO、多线程、网络通信\\1-IO-1", "test.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
        bufferedWriter.write("今天天气真的很好，但是大家还是待在家里好");
        bufferedWriter.newLine();// 换行继续写
        bufferedWriter.write("万里千山隔绝不了我们的情谊");
//        bufferedWriter.flush();
        bufferedWriter.close();// 关闭输出流
    }
}
