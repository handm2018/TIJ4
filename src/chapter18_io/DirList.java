package chapter18_io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 目录列表
 */
public class DirList {

    public static void main(String[] args) {
        File path = new File("/home/handm/IdeaProjects/TIJ4/src/chapter10");
        // 只获取以.java结尾的文件列表
        String regex = "^[A-Za-z]+.java$";
        String[] files = path.list(new DirFilter(regex));
        Arrays.sort(files, String.CASE_INSENSITIVE_ORDER);
        for (String s : files) {
            System.out.println(s);
        }
    }
}

/**
 * 文件过滤器
 * 接收正则表达式的参数
 * 策略模式的一种使用方式
 */
class DirFilter implements FilenameFilter {

    private Pattern pattern;

    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}