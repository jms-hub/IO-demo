package com.qianfeng.tuesday.operation;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("张三", 2001, 99.9);
        Student student2 = new Student("李四", 2002, 98.8);
        Student student3 = new Student("王五", 2003, 100.0);
        FileOutputStream fileOutputStream = new FileOutputStream(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\student.txt"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        // 把三个学生放到集合里边得了
        Set<Object> set = new HashSet<>();
        set.add(student);// 把学生放到集合
        set.add(student2);// 把学生放到集合
        set.add(student3);// 把学生放到集合
        objectOutputStream.writeObject(set);// 把集合写到文件
        objectOutputStream.close();// 关闭流
        FileInputStream fileInputStream = new FileInputStream(new File("T:\\2020年春逆战\\第一周-IO、多线程、网络通信\\2-IO-2\\student.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object o = objectInputStream.readObject();// 从文件中把集合读出来
        Set<Student> studentSet = (Set<Student>) o;
        for (Student s : studentSet) {// 遍历集合
            System.err.println(s.show());// 打印show方法
        }


    }
}
