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
		e.printStackTrace(new PrintWriter(trace));
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
