package com.qianfeng.tuesday.print;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\test.txt"));
        printStream.println("今天早晨，歌曲都还喜欢吗？我可是花了钱充的会员");
        printStream.close();
    }
}
