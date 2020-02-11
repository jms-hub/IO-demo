package com.qianfeng.周二.标准输出和输入流Scanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        // 构造一个Scanner
        Scanner scanner = new Scanner(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\test.txt"));

        scanner.useDelimiter(";");// 把;设置成分隔符!分隔符可以自定义的！
        while (scanner.hasNext()) {// 判断是否还有下一个
            String s = scanner.next();// 下一个分隔符之前的内容，默认分隔符 有tab 回车
//            String s = scanner.nextLine();// 下一行内容
            System.err.println(s);
        }
    }
}
