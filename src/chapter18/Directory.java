package chapter18;

//import net.mindview.util.PPrint;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author : handongming
 * @date : Created in 2019/8/23 13:05
 * @description: File工具类
 * @modified By:
 * @version: 1.0
 */
public final class Directory {

    public static File[] local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }

    public static File[] local(String path, final String regex) {
        return local(new File(path), regex);
    }


    public static class TreeInfo implements Iterable<File> {

        public List<File> files = new ArrayList<>();
        public List<File> dirs = new ArrayList<>();

        @Override
        public Iterator<File> iterator() {
            return files.iterator();
        }

        void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        @Override
        public String toString() {
           // return "dirs:"+ PPrint.pformat(dirs) +System.lineSeparator()+"files:"+PPrint.pformat(files);
            return "dirs:"+ dirs +System.lineSeparator()+"files:"+files;
        }
    }


    public static TreeInfo walk(String start, String regex) {
        return recurseDirs(new File(start), regex);
    }

    public static TreeInfo walk(File start, String regex) {
        return recurseDirs(start, regex);
    }

    public static TreeInfo walk(File start) {
        return recurseDirs(start, ".*");
    }

    public static TreeInfo walk(String start) {
        return recurseDirs(new File(start), ".*");
    }

    private static TreeInfo recurseDirs(File startDir, String regex) {
        TreeInfo result = new TreeInfo();
        for (File item : startDir.listFiles()) {
            if (item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex));
            } else {
                if (item.getName().matches(regex)) {
                    result.files.add(item);
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        //System.out.println(walk("E:/io"));

        chapter18.PPrint.pprint(Directory.walk("E:/io").dirs);
        for (File file : Directory.local("E:/io", "a.*")) {
            System.out.println(file);
        }
    }



}
