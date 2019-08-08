/**
*
*
*/
package chapter12;

/**
 * <p>
 * Title: E02_NullException
 * </p>
 * <p>
 * Description:
 * </p>
 * @author handongming @date 2019年8月1日
 */
public class E02_NullException {
	public static void main(String[] args) {
		String a = null;
		try {
			a.length();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
