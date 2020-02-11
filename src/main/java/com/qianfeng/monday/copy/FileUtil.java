package com.qianfeng.monday.copy;

import java.io.*;

/**
 * 文件工具类
 * author 森林杜夫人
 */
public class FileUtil {
    /**
     * 文件的复制方法
     *
     * @param originFile
     * @return
     * @throws Exception
     */
    public static boolean copy(File originFile) throws Exception {
        InputStream inputStream = new FileInputStream(originFile);// 获取输入流就有了
        String newFileName = originFile.getParent() + File.separator;//获取父路径
        String oldFileName = originFile.getName();
        newFileName += oldFileName.substring(0, oldFileName.lastIndexOf(".")) + "-副本" + oldFileName.substring(oldFileName.lastIndexOf("."));
        OutputStream outputStream = new FileOutputStream(new File(newFileName));
        byte[] bytes = new byte[8192];// 我们准备一个8192字节的数组进行缓冲
        int len;
        while (-1 != (len = inputStream.read(bytes))) {
            outputStream.write(bytes, 0, len);
        }
        inputStream.close();
        outputStream.close();
        return true;
    }


}
