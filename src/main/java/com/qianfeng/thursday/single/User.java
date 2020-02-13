package com.qianfeng.thursday.single;


/**
 * 作者：黎杭
 * 日期：2020/2/13
 * <p>
 * 实现单例的User实例
 * <p>
 * 饿汉式 单例
 */
public class User {
    private static User user = new User();

    private User() {// 把构造方法私有化，外部呢就不能够通过new关键字去创建对象实例了
    }

    public static User getInstance() {// 如果不设置成静态方法，那么外界没有办法new对象，也就没有办法调用这个方法，而静态方法是类名.方法名即可调用
        return user;
    }
}
