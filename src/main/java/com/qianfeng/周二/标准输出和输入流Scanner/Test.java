package com.qianfeng.周二.标准输出和输入流Scanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        System.err.println("请输入你想看的片名？");
        Scanner scanner = new Scanner(new FileInputStream("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\test.txt"));// 键盘输入流
        scanner.useDelimiter(";");
        System.err.println(scanner.next());
        System.err.println(scanner.next());
        System.err.println(scanner.next());
    }
}
