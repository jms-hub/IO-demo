package com.qianfeng.monday.operation;

import java.io.File;

public class Test {

    public static void main(String[] args) {

        File file = new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\1-IO-1");
//        List<String> res = FileUtil.findFileByStr(file);
        FileUtil.findFileByStr2(file);

        FileUtil.deleteAllFiles(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\1-IO-1\\haha"));
    }
}
