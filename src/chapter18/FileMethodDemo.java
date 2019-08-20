package chapter18;

import java.io.File;
import java.io.IOException;

/**
 * @author : handongming
 * @date : Created in 2019/8/20 15:48
 * @description: File类常用方法      File类表示文件和目录路径名的抽象表示形式。
 * @modified By:
 * @version: 1.0
 */
public class FileMethodDemo {

    public static void main(String[] args) throws IOException {
        constructMethod();
        createMethod();
        deleteMethod();


    }

    /**
     *@Description: File类的删除功能
     *@Param: 
     *@return: 
     *@Author: your name
     *@date: 2019/8/20
     */
    private static void deleteMethod() throws IOException {
        //public boolean delete()删除此抽象路径名表示的文件或目录。如果此路径名表示一个目录，则该目录必须为空才能删除。
        //当且仅当成功删除文件或目录时，返回 true；否则返回 false
        File file1 = new File("D:/io/newDic3/newFile.txt");
        file1.createNewFile();
        File delFile = new File("D:/io/newDic3");
        boolean isDeleted = file1.delete();
        boolean isDeleted2 = delFile.delete();
        System.out.println("newFile.txt文件是否已删除成功："+isDeleted);
        System.out.println("newDic3文件目录是否已删除成功："+isDeleted2);
    }

    /**
     *@Description: File类中的创建功能
     *@Author: your name
     *@date: 2019/8/20
     */
    private static void createMethod() throws IOException {
        //createNewFile()   当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
        // 如果指定的文件不存在并成功地创建，则返回 true；如果指定的文件已经存在，则返回 false
        // 如果父目录不存在，抛出io异常 java.io.IOException: 系统找不到指定的路径。
        File newFile1 = new File("E:/io/newFile.txt");
        boolean isCreated = newFile1.createNewFile();
        System.out.println("创建文件是否成功："+ isCreated);

        //public boolean mkdir()创建此抽象路径名指定的目录。当且仅当已创建目录时，返回 true；否则返回 false
        // 如果父级目录不存在，不会创建
        File newDic2 = new File("D:/io/newDic2");
        boolean isCreated2 = newDic2.mkdir();
        System.out.println("创建文件目录2是否成功："+ isCreated2);

        //public boolean mkdirs()创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。注意，此操作失败时也可能已经成功地创建了一部分必需的父目录。
        // 当且仅当已创建目录以及所有必需的父目录时，返回 true；否则返回 false
        File newDic3 = new File("D:/io/newDic3");
        boolean isCreated3 = newDic3.mkdirs();
        System.out.println("创建文件目录3是否成功："+ isCreated3);
    }

    /**
     *@Description: File类构造方法
     *@Author: your name
     *@date: 2019/8/20
     */
    private static void constructMethod() {
        //File(String pathname)   通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
        File file1 = new File("E:/io/1.txt");
        System.out.println(file1);

        //File(String parent, String child)  根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
        File file2 = new File("E:/io","2.txt");
        System.out.println(file2);

        //public File(File parent,String child)  根据父目录的File对象和儿子的名称封装一个File对象
        File parentFile = new File("E:/io");
        File file3 = new File(parentFile,"1.txt");
        System.out.println(file3);
    }


}
