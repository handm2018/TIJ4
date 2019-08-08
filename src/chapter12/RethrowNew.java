/**
*
*
*/
package chapter12;

/** 
　 * <p>Title: RethrowNew</p> 
　 * <p>Description: </p> 
　 * @author handongming 
　 * @date 2019年8月2日 
*/
public class RethrowNew {

	public static void f() throws OneException{
		System.out.println("originating the exception in f()");
		throw new OneException("thrown from f()");
	}
	
	public static void main(String[] args) {
		try {
			try {
				f();
			} catch (OneException e) {
				System.out.println("caught in inner try, e.printStackTrace():");
				e.printStackTrace(System.out);
				throw new TwoException("from inner try");
			}
		} catch (TwoException e) {
			// 只知道自己来源于main 对f()一无所知
			System.out.println("caught in outter try, e.printStackTrace():");
			e.printStackTrace(System.out);
		}
	}
	
}

class OneException extends Exception {
	public OneException (String s) {
		super(s);
	}
}

class TwoException extends Exception {
	public TwoException (String s) {
		super(s);
	}
}
