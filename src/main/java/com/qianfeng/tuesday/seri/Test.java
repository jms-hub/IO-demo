package com.qianfeng.tuesday.seri;

import java.io.*;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User();
        user.setName("小泽行");
        user.setBirthday(new Date());
        user.setAge(18);
        user.setMoney(9.9);
        user.setPassword("123456");
        user.setPhone("18223170162");
        // 序列化
        OutputStream outputStream = new FileOutputStream(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\user.txt"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);// 构造对象输出流
        objectOutputStream.writeObject(user);// 把user对象写入到输出流中
        objectOutputStream.close();// 手动关闭输出流
        // 反序列化
        FileInputStream fileInputStream = new FileInputStream(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\user.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);// 这个叫多态
        Object o = objectInputStream.readObject();
        System.err.println(o);
    }
}
