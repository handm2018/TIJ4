package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author : handongming
 * @date : Created in 2020/9/9 13:03
 * @desc :
 */
public class DateFormatUtil {
    private DateFormatUtil(){}

    public static String format(LocalDateTime localDateTime) {
        if (null != localDateTime) {
            return localDateTime.format(DateTimeFormatter.ISO_DATE);
        }
        return "";
    }


    public static void main(String[] args) {
        System.out.println(DateFormatUtil.format(LocalDateTime.now()));

    }
}
