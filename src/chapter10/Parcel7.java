package chapter10;

/**
 * ClassName: Parcel7 <br/>
 * Function: 匿名内部类的创建. <br/>
 * date: 2019年1月15日 上午11:23:48 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
        Contents contents = parcel7.contents();
        System.out.println(contents.value());
    }
}
