package chapter10;

/**
 * ClassName: parsel2 <br/>
 * Function:  内部类的一个典型示例，外部类含有一个方法，该方法返回一个指向内部类的引用. <br/>
 * date: 2019年1月11日 上午11:01:36 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Parcel2 {
    
    /**
     * ClassName: Contents <br/> 
     * Function: 内部类的创建，在另一个类的定义内部定义这个类. <br/> 
     * date: 2019年1月14日 上午10:08:24 <br/> 
     * 
     * @author handm2018@126.com 
     * @version Parcel2
     */
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String lable;

        public Destination(String whereTo) {
            super();
            this.lable = whereTo;
        }

        String readLable() {
            return lable;
        }
    }

    /**
     * 
     * to:外部类种含有一个方法，返回一个指向内部类的引用. <br/> 
     * @author hanxiaoming 
     * @param lable
     * @return
     */
    public Destination to(String lable) {
        return new Destination(lable);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String destination) {
        Contents c = new Contents();
        Destination d = to(destination);
        d.readLable();
    }
    
    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        Contents contents = p.contents();
        Destination destination = p.to("HangZhou");
    }
}
