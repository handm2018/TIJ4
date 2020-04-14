package chapter13_collections;
/**
 * @author T440P 2018年11月29日 上午11:03:38
 * @since 1.0.0
 */
public class ImmuTable {
    
    public static String upcase(String s){
        return s.toUpperCase();
    }
    
    public static void main(String[] args) {
        String str1 = "mystring";
        System.out.println(str1);
        /**
         *
         */
        String upcase = upcase(str1);
        System.out.println(upcase);
        System.out.println(str1);
    }

}
