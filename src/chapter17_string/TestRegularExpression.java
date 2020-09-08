package chapter17_string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : handongming
 * @date : Created in 2020/9/8 15:30
 * @desc : 正则表达式1
 */
public class TestRegularExpression {
    public static void main(String[] args) {

        String a = "abcabcabcabcdefabc";
        System.out.println(String.format("Input: %s", a));

        String regex1 = "abc+";
        String regex2 = "(abc)+";
        String regex3 = "(abc){2,}";

        String[] regexes = {regex1, regex2, regex3};

        for (String regex : regexes) {
            Pattern compile = Pattern.compile(regex);
            Matcher matcher = compile.matcher(a);
            while (matcher.find()) {
                System.out.println("Match : " + matcher.group());
                System.out.println(matcher.start() + " : " + matcher.end());
            }
        }


    }
}
