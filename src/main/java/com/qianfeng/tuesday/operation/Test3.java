package com.qianfeng.tuesday.operation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws IOException {
        File file = new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\IO思维导图.jpg");
        Path path = file.toPath();// 获取Path对象
        File outFile = new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\3-多线程-1\\思维导图的复制.jpg");
        Files.copy(path, new FileOutputStream(outFile));
    }
}
