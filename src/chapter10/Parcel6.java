package chapter10;

/**
 * ClassName: Parcel6 <br/>
 * Function: TrackingSlip类被嵌在if条件中，并不是说该类的创建是有条件的，它与别的类一起编译过了。然而在定义TrackingSlip的作用域外，它是不可用的。. <br/>
 * date: 2019年1月14日 下午4:26:18 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Parcel6 {
    public void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                public TrackingSlip(String s) {
                    id = s;
                }

                String getSlip() {
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("sss");
            String slip = ts.getSlip();
            System.out.println("-------------" + slip);
        }
        // 不能在此处创建，作用域
        // TrackingSlip ts = new TrackingSlip("sss");
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.internalTracking(true);
    }
}
