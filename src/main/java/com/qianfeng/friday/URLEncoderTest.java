package com.qianfeng.friday;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Base64;

/**
 * 作者：黎杭
 * 日期：2020/2/14
 * 对中文进行编码操作测试类
 */
public class URLEncoderTest {
    public static void main(String[] args) throws Exception {
        String s = "千锋Java,很牛！";
        String encode = URLEncoder.encode(s, "UTF-8");// 编码的时候用的 编码，解码的时候就要用什么编码来解码
        System.err.println("加密后的字符串是：" + encode);
        // 解码操作
        String gbk = URLDecoder.decode(encode, "UTF-8");
        System.err.println(gbk);// 如果不传入于加密时候相同的编码，那么解码就会有问题
    }
}
