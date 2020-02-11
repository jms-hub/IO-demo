package com.qianfeng.tuesday.mem;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        String qf = "QIANFENG";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(qf.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int t;// 读取一个字节，这里读到的是二进制数据转换成的十进制数据
        // t实际上就是一个字符
        while (-1 != (t = byteArrayInputStream.read())) {
            //  char c = (char) t; // int类型转换成char
            // 把字符小写，既然大写字母转小写字母
            t += 32;// 直接大写字母转换成小写字母
            // 小的反而大，大的反而小
            byteArrayOutputStream.write(t);
            System.err.println(byteArrayOutputStream.toString());// 每次都输出
        }
        System.err.println(byteArrayOutputStream.toString());// 完整的输出一次
    }
}
