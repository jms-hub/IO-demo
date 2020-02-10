package com.qianfeng.周二.理解装饰者设计模式;

public class MubanHousing implements ShimizuHousing {
    private ShimizuHousing shimizuHousing;

    public MubanHousing(ShimizuHousing shimizuHousing) {
        this.shimizuHousing = shimizuHousing;
    }

    @Override
    public void decoration() {
        shimizuHousing.decoration();
        System.err.println("我的地板贴木板");
    }
}
