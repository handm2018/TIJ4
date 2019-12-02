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

/**
 * 使得list()方法可以回调accept方法，这种结构通常称为回调结构
 * 同时为list()方法提供算法，这也是策略模式的一个例子
 *
 */
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