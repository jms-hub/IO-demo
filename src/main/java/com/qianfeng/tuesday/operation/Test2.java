package com.qianfeng.tuesday.operation;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\Hello.txt"));
        String s = scanner.nextLine();
        System.err.println(s);
    }
}
