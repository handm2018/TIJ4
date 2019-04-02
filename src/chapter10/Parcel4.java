package chapter10;

/**
 * ClassName: Parcel4 <br/>
 * Function: 内部类与向上转型的例子说明。当内部类向上转型为其基类的时候，可以完全的隐藏实现细节。. <br/>
 * date: 2019年1月14日 上午10:19:38 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String lable;

        private PDestination(String whereTo) {
            this.lable = whereTo;
        }

        @Override
        public String readLable() {
            return lable;
        }
    }

    /**
     * 
     * destination:外部类中获取一个内部类引用的方法，但是此处向上转型，返回的是基类的引用，指向了子类对象， 此处隐藏了细节，用户甚至不知道拿到的具体是什么类. <br/>
     * 
     * @author handm2018@126.com
     * @param s
     * @return
     */
    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        // 向上转型，返回的是基类的引用，指向了子类对象
        Destination destination = p.destination("beijing");
        Contents contents = p.contents();
        contents.value();
        System.out.println("要去的地方：" + destination.readLable());
    }
}
