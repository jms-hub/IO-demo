package com.qianfeng.tuesday.decorator;

public class CizhuanHousing implements ShimizuHousing {
    private ShimizuHousing shimizuHousing;

    public CizhuanHousing(ShimizuHousing shimizuHousing) {
        this.shimizuHousing = shimizuHousing;
    }
    @Override
    public void decoration() {
        shimizuHousing.decoration();
        System.err.println("我的地板贴瓷砖");
    }
}
