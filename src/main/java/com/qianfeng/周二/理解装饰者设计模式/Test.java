package com.qianfeng.周二.理解装饰者设计模式;

public class Test {
    public static void main(String[] args) {
        // 体现了咱们之前学多态
        MubanHousing mubanHousing = new MubanHousing(new BasicHousing());
        mubanHousing.decoration();// 开始装修房子

        // 有的客户喜欢贴瓷砖
        System.err.println("========换行======");

        CizhuanHousing cizhuanHousing = new CizhuanHousing(new BasicHousing());

        cizhuanHousing.decoration();// 瓷砖房开始装修


        // 有的客户喜欢贴瓷砖和贴木板
        System.err.println("========换行======");

        CizhuanHousing cizhuanHousing1 = new CizhuanHousing(mubanHousing);// 把木板房丢进去
        cizhuanHousing1.decoration();// 开始装修


    }
}
