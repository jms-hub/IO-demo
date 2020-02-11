package com.qianfeng.tuesday.decorator;

/**
 * 这个是一个基装房子
 */
public class BasicHousing implements ShimizuHousing {
    @Override
    public void decoration() {// 基装房装修房子
        System.err.println("第一步：打线槽");
        System.err.println("第二步：安装水管");
        System.err.println("第三步：安装电线");
        System.err.println("第四步：安装木工");
    }
}
