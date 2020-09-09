package chapter17_string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : handongming
 * @date : Created in 2020/9/9 13:49
 * @desc :
 */
public class E10_CheckForMatch {
    public static void main(String[] args) {
        String source = "Java now has regular expressions";
        String[] regexes = {"^Java", "\\Breg.*",
                "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "s{1}.",
                "s{0,3}"};
        for (String regex : regexes) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(source);
            while (matcher.find()) {
                System.out.println("regex:" + regex + ",at position" + matcher.start() + "--" + (matcher.end()));
                System.out.println(source.substring(matcher.start(),matcher.end()));
            }
        }
    }
}
