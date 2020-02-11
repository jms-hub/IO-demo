package com.qianfeng.周二.序列化和反序列化;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 序列化要实现Serializable接口，以后的所有实体类，都需要实现这个接口
 * POJO 简单Java类对象
 * entity(实体类：就是简单Java类和数据库表的一个对应关系)
 * dto(传输类：它是远程之间通信返回的传输对象)
 * vo(显示类：前端需要哪些显示的属性，比如说一个日期)
 * query(查询类：前端传递的查询参数，封装到一个查询类对象之中，就用对象去接收这些参数)
 */
@Data  // 在实际开发之中，很多人省事，都是用的lombok插件
public class User implements Serializable {

    /**
     * 用户的名称
     */
    private String name;

    /**
     * 用户的手机号
     */
    private String phone;

    /**
     * 用户的密码
     */
    private String password;

    /**
     * 用户的生日,Date只是 java.util
     */
    private Date birthday;
    /**
     * 用包装类，用户的年龄
     */
    private Integer age;

    /**
     * 用户的钱
     */
    private Double money;


    // 第一种，alt+insert键


    // 第二种，安装Lombok插件，装好之后，还需要引入lombok的包,最后在类上加@Data


}
