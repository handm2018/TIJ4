/**
*
*
*/
package chapter12;

/** 
　 * <p>Title: E03_ArrayIndexOfBoundsException</p> 
　 * <p>Description: </p> 
　 * @author handongming 
　 * @date 2019年8月1日 
*/
public class E03_ArrayIndexOfBoundsException {
	public static void main(String[] args) {
		Integer[] intArr = {1,2,3,4,5};
		try {
			int a = intArr[10];
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
