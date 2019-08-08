/**
*
*
*/
package chapter12;

/** 
　 * <p>Title: WhoCalled</p> 
　 * <p>Description:栈轨迹，getStackTrace()方法返回一个由栈轨迹中的元素组成的数组，一个元素表示一栈，元素0是栈顶 </p> 
　 * @author handongming 
　 * @date 2019年8月2日 
*/
public class WhoCalled {
	
	static void f() {
		try {
			throw new Exception();
		} catch (Exception e) {
			for (StackTraceElement ste : e.getStackTrace()) {
				System.out.println(ste.getMethodName());
			}
		}
	}
	
	static void g() {
		f();
	}
	
	static void h() {
		g();
	}
	
	public static void main(String[] args) {
		f();
		System.out.println("--------------------------------");
		g();
		System.out.println("--------------------------------");
		h();
	}

}
