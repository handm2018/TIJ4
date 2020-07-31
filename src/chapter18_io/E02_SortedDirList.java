package chapter18_io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/****************** Exercise 2 *******************
 * Create a class called SortedDirList with a* constructor that takes a File object and builds* a sorted directory list
 * from the files at that* File. Add to this class two overloaded list()* methods: the first produces the whole list,
 * and* the second produces the subset of the list that* matches its argument (which is a regular* expression).
 * ***********************************************/
public class E02_SortedDirList {
    public static void main(String[] args) {

        SortedDirList sortedDirList = new SortedDirList();
        String[] list = sortedDirList.list();
        System.out.println(Arrays.asList(list));

        SortedDirList sortedDirList1 = new SortedDirList(new File("/home/handm/IdeaProjects/TIJ4/src/chapter18_io"));
        sortedDirList1.list("//*.java");
    }


}


class SortedDirList {

    private File filePath;

    public SortedDirList() {
        filePath = new File(".");
    }

    public SortedDirList(File file) {
        this.filePath = file;
    }

    public String[] list() {
        String[] list = filePath.list();
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        return list;

    }

    public String[] list(String filter) {
        String[] list = filePath.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(filter);

            @Override
            public boolean accept(File file, String s) {
                return pattern.matcher(s).matches();
            }
        });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        return list;
    }
}

