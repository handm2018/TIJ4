package chapter18;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/**
 * @author : handongming
 * @date : Created in 2019/8/20 15:48
 * @description: File类常用方法      File类表示文件和目录路径名的抽象表示形式。
 * @modified By:
 * @version: 1.0
 */
public class FileMethodDemo {

    public static void main(String[] args) throws IOException {
//        constructMethod();
//        createMethod();
//        deleteMethod();
//        renameMethod();
//        judgementMethod();
//
//        getMethod();

        listMethod();


    }

    /**
     *@Description: list方法
     *@Param: 
     *@return: 
     *@Author: your name
     *@date: 2019/8/21
     */
    private static void listMethod() {
        File file1 = new File("E:/io");
        //public String[] list()返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录
        String[] files1 = file1.list();
        System.out.println(Arrays.toString(files1));
        //public String[] list(FilenameFilter filter)返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的文件和目录。
        String[] files2 = file1.list();
        //public File[] listFiles()返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。

        //public File[] listFiles(FilenameFilter filter)返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
    }

    /**
     *@Description: File类的获取功能
     *@Param: 
     *@return: 
     *@Author: your name
     *@date: 2019/8/21
     */
    private static void getMethod() throws IOException {
        File file1 = new File("E:/io/a.txt");
        File file2 = new File("E:/io");
        //public String getName()返回由此抽象路径名表示的文件或目录的名称。该名称是路径名名称序列中的最后一个名称。如果路径名名称序列为空，则返回空字符串。 此抽象路径名表示的文件或目录的名称；如果路径名的名称序列为空，则返回空字符串
        System.out.println("a.txt文件的名字："+file1.getName());
        //public long lastModified()返回此抽象路径名表示的文件最后一次被修改的时间。 表示文件最后一次被修改的时间的 long 值，用与时间点（1970 年 1 月 1 日，00:00:00 GMT）之间的毫秒数表示；如果该文件不存在，或者发生 I/O 错误，则返回 0L
        System.out.println("a.txt文件最后修改时间是："+ new Date(file1.lastModified()));
        //public long length()返回由此抽象路径名表示的文件的长度。如果此路径名表示一个目录，则返回值是不确定的。 此抽象路径名表示的文件的长度，以字节为单位；如果文件不存在，则返回 0L
        System.out.println("a.txt文件的内容长度："+file1.length());
        /**System.out.println("io文件目录的内容长度："+file2.length());  */
        //public File getAbsoluteFile()返回此抽象路径名的绝对路径名形式。等同于 new File(this.getAbsolutePath())。绝对抽象路径名，它与此抽象路径名表示相同的文件或目录
        System.out.println("a.txt文件的绝对路径："+file1.getAbsolutePath());
        //public String getCanonicalPath()throws IOException返回此抽象路径名的规范路径名字符串。规范路径名字符串，它与此抽象路径名表示相同的文件或目录
        System.out.println("a.txt文件的规范路径名字符串："+file1.getCanonicalPath());
    }

    /**
     *@Description: File 类的判断
     *@Param: 
     *@return: 
     *@Author: your name
     *@date: 2019/8/21
     */
    private static void judgementMethod() {
        File dict = new File("E:/io");
        File file1 = new File("E:/io/a.txt");
        //public boolean canRead()测试应用程序是否可以读取此抽象路径名表示的文件。当且仅当此抽象路径名指定的文件存在且 可被应用程序读取时，返回 true；否则返回 false
        System.out.println("file1 is canRead:" + file1.canRead());
        //public boolean canWrite()测试应用程序是否可以修改此抽象路径名表示的文件。当且仅当文件系统实际包含此抽象路径名表示的文件且 允许应用程序对该文件进行写入时，返回 true；否则返回 false
        System.out.println("file1 is canWrite:" + file1.canWrite());
        //public boolean exists()测试此抽象路径名表示的文件或目录是否存在。当且仅当此抽象路径名表示的文件或目录存在时，返回 true；否则返回 false
        System.out.println("file1 is exists:" + file1.exists());
        System.out.println("dict is exists:" + dict.exists());
        //public boolean isDirectory()测试此抽象路径名表示的文件是否是一个目录。 当且仅当此抽象路径名表示的文件存在且 是一个目录时，返回 true；否则返回 false
        System.out.println("dict is directory:"+ dict.isDirectory());
        //public boolean isFile()测试此抽象路径名表示的文件是否是一个标准文件。如果该文件不是一个目录，并且满足其他与系统有关的标准，那么该文件是标准 文件。由 Java 应用程序创建的所有非目录文件一定是标准文件。 当且仅当此抽象路径名表示的文件存在且 是一个标准文件时，返回 true；否则返回 false
        System.out.println("file1 is file:"+file1.isFile());
        //public boolean isHidden()测试此抽象路径名指定的文件是否是一个隐藏文件。当且仅当此抽象路径名表示的文件根据底层平台约定是隐藏文件时，返回 true
        System.out.println("file1 is hidden:"+file1.isHidden());
    }

    /**
     *@Description: 重命名功能
     *@Param: 
     *@return: 
     *@Author: your name
     *@date: 2019/8/21
     */
    private static void renameMethod() {
        //public boolean renameTo(File dest)重新命名此抽象路径名表示的文件
        //1.如果源文件和目标文件在一个目录下，重命名；2.如果不在一个目录下，剪切+重命名
        File src = new File("E:/io/newFile.txt");
        File dest = new File("E:/io/a.txt");
        boolean isRenamed = src.renameTo(dest);
        System.out.println("文件名称修改是否成功："+isRenamed);
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
