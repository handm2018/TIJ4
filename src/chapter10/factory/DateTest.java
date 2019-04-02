package chapter10.factory;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * ClassName: DateTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2019年1月18日 上午11:26:32 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class DateTest {
    public static void main(String[] args) {
        Locale locale = Locale.CHINESE;
        Date date = new Date();
        String now = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale).format(date);
        String now2 = DateFormat.getDateInstance().format(date);
        System.out.println(now);
        System.out.println(now2);
    }
}
