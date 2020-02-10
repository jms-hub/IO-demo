package com.qianfeng.周二.序列化和反序列化;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private String name;

    private Integer age;

    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
