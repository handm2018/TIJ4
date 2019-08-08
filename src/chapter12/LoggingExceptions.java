/**
*
*
*/
package chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * <p>
 * Title: LoggingExceptions
 * </p>
 * <p>
 * Description:
 * </p>
 * @author handongming @date 2019年8月1日
 */
public class LoggingExceptions {
	public static void main(String[] args) {
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Caught" + e);
		}
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Caught" + e);
		}
	}
}

class LoggingException extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");

	public LoggingException() {
		StringWriter writer = new StringWriter();
		printStackTrace(new PrintWriter(writer));
		logger.severe(writer.toString());
	}
}