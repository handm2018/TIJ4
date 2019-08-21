package chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author : handongming
 * @date : Created in 2019/8/21 16:57
 * @description: 递归2
 * @modified By:
 * @version:
 */
public class Recursion02 {

    // 过滤D:\\test下，以及子目录中扩展名是.jpg的文件，输出其绝对路径。
    public static List<String> getAbsoPath(File file) {
        List<String> result = new ArrayList<>();
        if (file.isDirectory()) {
            String[] files = file.list();
            for (String name : files) {

            }
        }

        return null;
    }

}


class filter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {



        return true;
    }
}

