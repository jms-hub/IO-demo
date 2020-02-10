package com.qianfeng.周二.属性文件类;

import javax.annotation.processing.Filer;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.setProperty("name", "张三");
        System.err.println(properties.getProperty("name"));
        Properties properties1 = System.getProperties();
        properties1.store(new FileWriter(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\test.txt")), "我就是想写个属性文件测试");
        properties1.load(new FileReader(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\test.txt")));
        System.err.println(properties1);
    }
}
