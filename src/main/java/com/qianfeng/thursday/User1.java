package com.qianfeng.thursday;


/**
 * 作者：黎杭
 * 日期：2020/2/13
 * <p>
 * 实现单例的User实例
 * <p>
 * 懒汉式 单例
 */
public class User1 {
    private static User1 user;// 不应该把user new出来

    private User1() {// 把构造方法私有化，外部呢就不能够通过new关键字去创建对象实例了
    }

    /**
     * 这个方法机上同步操作，别的线程就不会卡在方法之中了，每个线程都会一口气执行完这段代码
     *
     * @return
     */
    public static synchronized User1 getInstance() {// 如果不设置成静态方法，那么外界没有办法new对象，也就没有办法调用这个方法，而静态方法是类名.方法名即可调用
        if (user == null) {// 当外面需要user对象的时候，如果user还没有创建出来，那么立即创建
            user = new User1();// 还没有执行这行代码的时候，CPU执行时间，被别的线程抢走了！
            // 我们知道每new 一个对象，就在内存中开辟了一块空间！
        }
        return user;
    }
}
