/**
*
*
*/
package chapter12;

/**
 * <p>
 * Title: ExtraFeatures
 * </p>
 * <p>
 * Description:
 * </p>
 * @author handongming @date 2019年8月2日
 */
public class ExtraFeatures {

	public static void f() throws MyException2 {
		System.out.println("throw myException2 from f()");
		throw new MyException2();
	}

	public static void g() throws MyException2 {
		System.out.println("throw myException2 from g()");
		throw new MyException2("originated in g()");
	}

	public static void h() throws MyException2 {
		System.out.println("throw myException2 from h()");
		throw new MyException2("originated in h()", 47);
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
		}
		
		try {
			g();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
		}
		
		try {
			h();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
		}
	}

}

/**
 * <p>
 * Title: MyException2
 * </p>
 * <p>
 * Description: 自定义异常，加入额外的构造器和成员，输出更详细的异常信息
 * </p>
 * @author handongming @date 2019年8月2日
 */
class MyException2 extends Exception {
	private int x;

	public MyException2() {

	}

	public MyException2(String msg) {
		super(msg);
	}

	public MyException2(String msg, int x) {
		super(msg);
		this.x = x;
	}

	public int val() {
		return x;
	}

	public String getMessage() {
		return "Detail Message: " + x + " " + super.getMessage();
	}
}