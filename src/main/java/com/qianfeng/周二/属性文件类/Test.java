package com.qianfeng.周二.属性文件类;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;


public class Test {
    public static void main(String[] args) throws Exception {
        Properties properties = System.getProperties();// 系统文件属性类
        System.err.println(properties);
        // os.name判断你当前的操作系统，在web阶段，会用来判断是线上还是开发环境，用来设置文件的映射路径
    }
}
