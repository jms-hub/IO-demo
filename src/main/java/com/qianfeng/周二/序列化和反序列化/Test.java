package com.qianfeng.周二.序列化和反序列化;

import java.io.*;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User();
        user.setAge(12);
        user.setBirthday(new Date());
        user.setName("张三");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\test.txt")));
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\test.txt")));
        Object o = objectInputStream.readObject();
        System.err.println(o);
    }
}
