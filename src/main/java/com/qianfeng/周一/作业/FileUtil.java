package com.qianfeng.周一.作业;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    private static List<String> list = new ArrayList<>();

    /**
     * 根据指定目录，寻找.txt后缀文件
     *
     * @param file
     * @return
     */
    public static List<String> findFileByStr(File file) {
        if (file.isDirectory()) {// 当前文件是目录
            // 如果当前文件还是个目录，就应该继续往下边找，所以方法递归调用
            File[] files = file.listFiles();// 文件目录下的所有文件就取出来

            for (File f : files) {
                findFileByStr(f);
            }
        } else {// 当前文件不是目录
            if (file.getName().endsWith(".txt")) {// 符合条件
                list.add(file.getName());
            }
        }
        return list;
    }


    /**
     * 根据指定目录，寻找.txt后缀文件
     *
     * @param file
     * @return
     */
    public static void findFileByStr2(File file) {
        // 再继续调用递归操作，就可以把所有符合条件都找出来
        FilenameFilter filenameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".txt")) {
                    return true;
                }
                return false;
            }
        }; // 是接口
        File[] files = file.listFiles(filenameFilter);// 符合条件的文件
        for (File f : files) {
            System.err.println(f.getName());
        }
    }

    public static void deleteAllFiles(File file) {

        if (!file.isDirectory()) {
            file.delete();// 不是目录，就直接删除了
        } else {// 如果是文件目录
            File[] files = file.listFiles();// 找到所有子文件
            for (File f : files) {
                deleteAllFiles(f);// 继续调用删除文件操作
            }
        }
        file.delete();// 最后还差了这一步哈

    }


}
