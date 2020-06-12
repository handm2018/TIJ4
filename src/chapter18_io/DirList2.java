package chapter18_io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 匿名内部类，创建一个filter()方法,返回一个指向FilenameFilter引用的方法，
 * filter()接收的参数必须是final修饰的，这样匿名内部类才能使用来自该类范围之外的对象
 * 这个设计有所改进，将DirList2与FilenameFilter紧密的绑定在了一起
 * 但是还能更进一步
 *
 */
public class DirList2 {

    public static FilenameFilter filenameFilter(final String regex){
        return new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return Pattern.compile(regex).matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {
        File filePath = new File("./src/chapter10");
        String[] list = filePath.list(filenameFilter("^[A-Za-z]+.java$"));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String s : list) {
            System.out.println(s);
        }
    }


}
