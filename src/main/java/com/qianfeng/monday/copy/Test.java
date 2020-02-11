package com.qianfeng.monday.copy;

import java.io.*;

public class Test {

    public static void main(String[] args) throws Exception {
        NzFile file = new NzFile("T:" + File.separator + "2020年春逆战" + File.separator + "第一周-IO、多线程、网络通信\\1-IO-1", "test.txt");
//        file.copy();
        // 第一种，咱们可以自定义File类，增加copy方法
        // 工具类实现复制
        FileUtil.copy(file);
        // 文件工具类
//        Files.copy();// 面向对象，我在这里要说的是一个思想
    }

}
