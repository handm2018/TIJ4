/**
*
*
*/
package chapter12;

/**
 * <p>
 * Title: ExceptionMethods
 * </p>
 * <p>
 * Description: exception 类的方法
 * </p>
 * @author handongming @date 2019年8月2日
 */
public class ExceptionMethods {

	public static void main(String[] args) {
		try {
			throw new MyException("my exception");
		} catch (MyException e) {
			System.out.println("caught exception");
			System.out.println("get message:" + e.getMessage());
			System.out.println("getLocalizedMessage:" + e.getLocalizedMessage());
			System.out.println("toString()" + e);
			System.out.println("printStackTrace:");
			e.printStackTrace(System.out);
		}
	}

}
