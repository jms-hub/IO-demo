package com.qianfeng.周一.字节缓冲流;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        File file1 = new File("T:" + File.separator + "2020年春逆战" + File.separator + "第一周-IO、多线程、网络通信\\1-IO-1", "test.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file1));
        byte[] bytes = new byte[10];
        int len = bufferedInputStream.read(bytes);
        System.err.println("第一次读取到的内容是：" + new String(bytes, 0, len));
        bufferedInputStream.mark(55); // 标记当前流的位置，并且从这里开始只能最多读取55个字节
        int len2 = bufferedInputStream.read(bytes);
        System.err.println("第二次读取到的内容是：" + new String(bytes, 0, len2));
        bufferedInputStream.reset();// 重新把流的位置 跳回之前mark标记的位置，覆水可收
        int len3 = bufferedInputStream.read(bytes);
        System.err.println("第三次读取到的内容是：" + new String(bytes, 0, len3));
////        bufferedInputStream.skip(12);// 跳过12个字节进行读取
    }
}
