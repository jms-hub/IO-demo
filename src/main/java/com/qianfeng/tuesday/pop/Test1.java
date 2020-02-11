package com.qianfeng.tuesday.pop;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Test1 {
    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();// 自定义文件属性类
//        properties.setProperty("name", "张三");
//        properties.setProperty("dbUrl", "119.36.118.250");
//        FileOutputStream fileOutputStream = new FileOutputStream(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\p.txt"));
//        properties.store(fileOutputStream, "我就是想测试一下这个属性文件的输出而已");
//
        properties.load(new FileInputStream(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\p.txt")));
        System.err.println(properties);
    }
}
