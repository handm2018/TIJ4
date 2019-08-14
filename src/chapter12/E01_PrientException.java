/**
*
*
*/
package chapter12;

/** 
　 * <p>Title: E01_PrientException</p> 
　 * <p>Description: </p> 
　 * @author handongming 
　 * @date 2019年8月1日 
*/
public class E01_PrientException {
	
	public static void main(String[] args) {
		try {
			throw new Exception("test");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("这里执行了");
		}
	}

}
