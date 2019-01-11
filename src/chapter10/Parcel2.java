package chapter10;

/**
 * ClassName: parsel2 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2019年1月11日 上午11:01:36 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Parcel2 {
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
