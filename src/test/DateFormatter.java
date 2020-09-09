package test;

import com.sun.istack.internal.NotNull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

/**
 * @author : handongming
 * @date : Created in 2020/9/9 13:08
 * @desc :
 */
public class DateFormatter implements Function<LocalDateTime, String> {

    private final DateTimeFormatter formatter;

    public DateFormatter(@NotNull DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public String apply(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return localDateTime.format(formatter);
        }
        return "";
    }


    public static void main(String[] args) {
        DateFormatter dateFormatter = new DateFormatter(DateTimeFormatter.ISO_DATE);
        String apply = dateFormatter.apply(LocalDateTime.now());
        System.out.println(apply);
    }
}
