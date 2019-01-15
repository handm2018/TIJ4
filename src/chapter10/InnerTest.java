package chapter10;

import chapter10.Parcel2.Contents;

/** 
 * ClassName: InnerTest <br/> 
 * Function: ADD FUNCTION. <br/> 
 * date: 2019年1月11日 上午11:44:28 <br/> 
 * 
 * @author handm2018@126.com 
 * @version  
 */
public class InnerTest {
    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        Parcel2.Destination destination = p.to("BeiJing");
        Contents contents = p.contents();
        Contents contents2 = p.new Contents();
    }
}
