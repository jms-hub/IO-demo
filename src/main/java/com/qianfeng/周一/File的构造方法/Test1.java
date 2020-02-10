package com.qianfeng.周一.File的构造方法;

import java.io.File;

public class Test1 {

    public static void main(String[] args) throws Exception {
        File file = new File("T:"+File.separator+"2020年春逆战"+File.separator+"第一周-IO、多线程、网络通信"+File.separator+"1-IO-1");
        File file1 = new File(file, "test.txt");
        System.err.println(file1);
    }

}
