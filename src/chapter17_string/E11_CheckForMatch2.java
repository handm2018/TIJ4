package chapter17_string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : handongming
 * @date : Created in 2020/9/9 14:08
 * @desc :
 */
public class E11_CheckForMatch2 {
    public static void main(String[] args) {
        String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher("Arline ate eight apples and \" +\n" +
                "\"one orange while Anita hadn't any");
        while (matcher.find()) {
            String s = matcher.group() + ";;;" + matcher.start();
            System.out.println(s);
        }

        Matcher matcher1 = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
        int i = 0;
        while (matcher1.find(i)) {
            System.out.println("------------------------===================----------------=============");
            System.out.println(matcher1.group());
            i++;
        }

    }
}
