package com.qianfeng.周二.内存流;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        String qf = "QIANFENG";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(qf.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int x;
        while (-1 != (x = byteArrayInputStream.read())) {
            byteArrayOutputStream.write(Character.toLowerCase(x));
            System.err.println(byteArrayOutputStream.toString());
        }
        System.err.println(byteArrayOutputStream.toString());
    }
}
