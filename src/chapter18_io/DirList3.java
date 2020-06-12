package chapter18_io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 直接定义一个作为list()参数的匿名内部类，程序变得更小
 * 优点是：将一次性的、解决特定问题的代码隔离，聚拢于一点
 * 缺点是：代码不易阅读
 */
public class DirList3 {

    public static void main(String[] args) {
        File filePath = new File("./src/chapter10");
        String[] list = filePath.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile("^.{3,20}$");

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
