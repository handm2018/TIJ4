package chapter18_io;

import net.mindview.util.TextFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 练习一
 */
public class E01_SearchWords {

    public static void main(String[] args) {
        File file = new File("./src");
        String[] list;
        if (args.length == 0) {
            list = file.list();
        } else {
            list = file.list(new FilenameFilter() {
                private String ext = args[0].toLowerCase();

                @Override
                public boolean accept(File dir, String name) {
                    if (name.toLowerCase().endsWith(ext)) {
                        if (args.length == 1) {
                            return true;
                        }

                        Set<String> words = new HashSet<>(new TextFile(new File(dir, name).getAbsolutePath(), "\\W+"));

                        for (int i = 0; i < args.length; i++) {
                            if (words.contains(args[i])) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            });
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
