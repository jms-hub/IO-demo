package com.qianfeng.周二.理解装饰者设计模式;

public class BasicHousing implements ShimizuHousing {
    @Override
    public void decoration() {
        System.err.println("打线槽");
        System.err.println("安装水管");
        System.err.println("安装电线");
        System.err.println("安装木工");
    }
}
