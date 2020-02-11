package com.qianfeng.tuesday.pop;

public class SystemUtil {
    /**
     * 判断当前系统是否是windows系统
     * 这个在咱们用springMVC上传图片的时候，做磁盘路径映射的时候需要用到
     *
     * @return
     */
    public static boolean isWindows() {
        String property = System.getProperties().getProperty("os.name");
        return property.toLowerCase().contains("windows");
    }
}
