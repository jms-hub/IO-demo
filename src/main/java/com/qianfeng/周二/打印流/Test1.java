package com.qianfeng.周二.打印流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        // 字符打印流
        PrintWriter printWriter = new PrintWriter(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\test.txt"));
        printWriter.println("随便输出一点数据吧");
        // 如果不关闭流，那么与刚才的PrintStream就有区别了。
        printWriter.close();
    }
}
