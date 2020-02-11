package com.qianfeng.monday.reader;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        File file = new File("T:" + File.separator + "2020年春逆战" + File.separator + "第一周-IO、多线程、网络通信\\1-IO-1", "test.txt");
        Reader fileReader = new FileReader(file); // ctrl+alt+u 看到类的继承结构

        char[] chars = new char[1024];

        int len = fileReader.read(chars);

        System.err.println(new String(chars, 0, len));

    }


}
