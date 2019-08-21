package chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author : handongming
 * @date : Created in 2019/8/21 15:09
 * @description:
 * @modified By:
 * @version:
 */
public class DirList2 {

    public static FilenameFilter filter(final String regex){
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {
        File file = new File(".");

        String[] list = file.list(filter("src"));
        Arrays.sort(list);

        for (String s : list) {
            System.out.println(s);
        }
    }


}
