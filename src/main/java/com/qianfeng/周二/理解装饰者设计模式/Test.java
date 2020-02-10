package com.qianfeng.周二.理解装饰者设计模式;

public class Test {
    public static void main(String[] args) {
        MubanHousing mubanHousing = new MubanHousing(new BasicHousing());
        mubanHousing.decoration();

        CizhuanHousing cizhuanHousing = new CizhuanHousing(new BasicHousing());
        cizhuanHousing.decoration();


        CizhuanHousing cizhuanHousing3 = new CizhuanHousing(mubanHousing);
        cizhuanHousing3.decoration();
    }
}
