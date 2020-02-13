package com.qianfeng.tuesday.operation;

import lombok.Data;

import java.io.Serializable;


public class Student implements Serializable {
   
    public Student(String name, Integer id, Double score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    // 姓名
    private String name;

    // 学号
    private Integer id;

    // 分数
    private Double score;

    public String show() {
        return toString();// 返回toString方法即可
    }
}
