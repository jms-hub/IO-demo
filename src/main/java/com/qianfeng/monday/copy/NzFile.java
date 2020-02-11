package com.qianfeng.monday.copy;

import java.io.*;
import java.net.URI;

/**
 * 自定义一个文件类，叫逆战File，让它继承自File类
 */
public class NzFile extends File {
    public NzFile(String pathname) {
        super(pathname);
    }

    public NzFile(String parent, String child) {
        super(parent, child);
    }

    public NzFile(File parent, String child) {
        super(parent, child);
    }

    public NzFile(URI uri) {
        super(uri);
    }

    /**
     * 自定义一个Copy方法
     *
     * @return
     */
    public boolean copy() throws Exception {

        InputStream inputStream = new FileInputStream(this);// 获取输入流就有了
        String newFileName = this.getParent() + File.separator;//获取父路径
        String oldFileName = this.getName();
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
