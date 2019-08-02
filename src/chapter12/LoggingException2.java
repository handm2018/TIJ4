/**
*
*
*/
package chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/** 
　 * <p>Title: LoggingException2</p> 
　 * <p>Description: </p> 
　 * @author handongming 
　 * @date 2019年8月1日 
*/
public class LoggingException2 {
	
	private static Logger logger = Logger.getLogger("LoggingException2");
	
	static void logException (Exception e) {
		StringWriter trace = new StringWriter();
		// printStackTrace()方法默认不会产生字符串
		e.printStackTrace(new PrintWriter(trace));
		// 使用log日志的方式，将异常信息使用string的方式输出
		logger.severe(trace.toString());
	}
	
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			logException(e);
		}
	}

}
