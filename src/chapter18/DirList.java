package chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author : handongming
 * @date : Created in 2019/8/15 14:35
 * @description:
 * @modified By:
 * @version:
 */
public class DirList {

    public static void main(String[] args) {
        File path = new File(".");
        System.out.println(path);
        String[] list;
        if (args.length==0){
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));

        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }

}

class DirFilter implements FilenameFilter{

    private Pattern pattern;
    public DirFilter(String regex){
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}