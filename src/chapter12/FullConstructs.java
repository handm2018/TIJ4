/**
*
*
*/
package chapter12;

/**
 * <p>
 * Title: FullConstructs
 * </p>
 * <p>
 * Description:
 * </p>
 * @author handongming @date 2019年8月1日
 */
public class FullConstructs {
	public static void f() throws MyException {
		System.out.println("throw new myException from f()");
		throw new MyException();
	}

	public static void g() throws MyException {
		System.out.println("throw new myException from g()");
		throw new MyException("originated in g()");
	}

	public static void main(String[] args) {

		try {
			f();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}

		try {
			g();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

}

class MyException extends Exception {

	/**
	 * 
	 */
	public MyException() {
		super();
	}

	/**
	 * @param message
	 */
	public MyException(String message) {
		super(message);
	}

}
