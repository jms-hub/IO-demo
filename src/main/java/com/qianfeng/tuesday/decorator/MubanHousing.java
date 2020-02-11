package com.qianfeng.tuesday.decorator;

public class MubanHousing implements ShimizuHousing {

    // 定义一个清水房成员，最大的，所以不管外面传什么，我都能接
    private ShimizuHousing shimizuHousing;

    public MubanHousing(ShimizuHousing shimizuHousing) {
        this.shimizuHousing = shimizuHousing;
    }

    @Override
    public void decoration() {// 木板房的装修方法
        shimizuHousing.decoration();// 基装房先来装修一波
        System.err.println("我的地板贴木板");
    }
}
