/**
*
*
*/
package chapter12;

/** 
　 * <p>Title: Rethrowing</p> 
　 * <p>Description: 异常的重新抛出</p> 
　 * @author handongming 
　 * @date 2019年8月2日 
*/
public class Rethrowing {
	
	public static void f() throws Exception {
		System.out.println("originating the exception in f()");
		throw new Exception("thowing from f()");
	}
	
	public static void g() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside g(), e.printStackTrace:");
			e.printStackTrace(System.out);
			//如果只是把当前异常对象重新抛出，那么显示的还是原来的异常信息
			throw e;
		}
	}
	
	public static void h() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside h(), e.printStackTrace:");
			e.printStackTrace(System.out);
			//使用方法fillInStackTrace()重新抛出异常，那么将会更新异常信息，将当前调用栈填入原来的那个异常对象，并返回Throwable对象
			throw (Exception)e.fillInStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			g();
		} catch (Exception e) {
			System.out.println("main, e.printStackTrace:");
			e.printStackTrace(System.out);
		}
		
		try {
			h();
		} catch (Exception e) {
			System.out.println("main, e.printStackTrace:");
			e.printStackTrace(System.out);
		}
		
		
	}
	

}
