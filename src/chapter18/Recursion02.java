package chapter18;

import java.io.File;
import java.io.FileFilter;

/**
 * @author : handongming
 * @date : Created in 2019/8/21 16:57
 * @description: 递归2
 * @modified By:
 * @version:
 */
public class Recursion02 {

    /**
     *@Description: 普通递归
     *@Param: 
     *@return: 
     *@Author: your name
     *@date: 2019/8/22
     */
    public static void scanDic(File dest) {

        if (dest.isFile()) {
            System.out.println("传入对象是文件，不是目录");
            return;
        }

        File[] files = dest.listFiles();
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isDirectory()) {
                    scanDic(file);
                } else {
                    if (file.getName().endsWith(".jpg")) {
                        System.out.println(file.getAbsolutePath());
                    }
                }
            }
        }
    }

    /**
     *@Description: 过滤器+递归
     *@Param: 
     *@return: 
     *@Author: your name
     *@date: 2019/8/22
     */
    public static void scanDic2(File dest) {
        File[] files = dest.listFiles(new DicFilter());
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isDirectory()) {
                    scanDic2(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }

            }
        }
    }

    public static void main(String[] args) {
        File dest = new File("E:/io");
        scanDic(dest);
        System.out.println("--------------------");
        scanDic2(dest);
    }



}

/**
 *@Description: boolean accept(File pathname)测试指定抽象路径名是否应该包含在某个路径名列表中。此接口的实例可传递给 File 类的 listFiles(FileFilter) 方法。
 *@Param: 
 *@return: 
 *@Author: your name
 *@date: 2019/8/22
 */
class DicFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.isDirectory() || pathname.getName().endsWith(".jpg");
    }
}


