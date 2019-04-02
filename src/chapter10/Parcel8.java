package chapter10;

/**
 * ClassName: Parcel8 <br/>
 * Function: 带参数的匿名内部类的创建。尽管Wraping只是一个具有实现的普通类，单它还是被当作公共接口来使用了. <br/>
 * date: 2019年1月15日 上午11:29:42 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Parcel8 {

    public Wraping wraping(String name) {
        return new Wraping(name) {
            private String str = "this";

            public void f() {
                super.f();
                System.out.println(str);
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p8 = new Parcel8();
        Wraping wraping = p8.wraping("xiaohong");
        wraping.f();
    }
}
