package com.qianfeng.monday.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws Exception {
        File file = new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\1-IO-1\\test.txt");
        System.err.println("文件是否存在：" + file.exists());

        if (!file.getParentFile().exists()) {// 如果父目录不存在
            file.getParentFile().mkdirs();// 创建父目录
        }
        file.createNewFile();// 文件不存在就创建文件
//        Thread.sleep(3000);
//        file.delete();// 删除文件
        System.err.println("父目录是：" + file.getParent());
        System.err.println("是否是文件：" + file.isFile());
        System.err.println("文件的长度：" + file.length());
        System.err.println("文件的名称：" + file.getName());
        System.err.println("文件最后一次修改时间：" + file.lastModified());
        System.err.println("文件最后一次修改时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(file.lastModified())) );
    }
}
