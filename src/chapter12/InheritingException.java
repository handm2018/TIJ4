package chapter12;

/**
 * 
　 * <p>Title: InheritingException</p> 
　 * <p>Description: </p> 
　 * @author handongming 
　 * @date 2019年8月1日
 */
public class InheritingException {
	public void f() throws SimpleException{
		System.out.println("throw SimpleException from f()");
		throw new SimpleException();
	}
	
	public static void main(String[] args) {
		InheritingException sed = new InheritingException();
		try {
			sed.f();
		} catch (SimpleException e) {
			System.out.println("caght it");
		}
	}
}

class SimpleException extends Exception {}