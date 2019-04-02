package chapter10;

/**
 * ClassName: Parvel9 <br/>
 * Function: 在内部类中定义字段并进行初始化。在jdk1.8之前，若内部类要使用外部定义的对象时，那么这个对象必须时final的。1.8取消了这个约定. <br/>
 * date: 2019年1月15日 下午2:29:14 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Parcel9 {

    private String name = "TOM";

    // public Destination destination( final String dest) { jdk1.8之前
    public Destination destination(String dest) {
        return new Destination() {
            private String lable = dest;

            @Override
            public String readLable() {
                return lable;
            }
        };
    }

    public Cat cat() {
        return new Cat() {
            // private String mouse = name;
            @Override
            public void catchMouse() {
                System.out.println(name);
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 parcel9 = new Parcel9();
        Destination destination = parcel9.destination("beijing");
        System.out.println(destination.readLable());
        Cat cat = parcel9.cat();
        cat.catchMouse();
    }

}


interface Cat {
    void catchMouse();
}
