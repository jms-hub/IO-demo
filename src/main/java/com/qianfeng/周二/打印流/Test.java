package com.qianfeng.周二.打印流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream=new PrintStream(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\test.txt"));
        printStream.print("张三李四王五");
    }
}
