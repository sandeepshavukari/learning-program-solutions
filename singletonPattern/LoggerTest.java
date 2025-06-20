package singletonPattern;

public class LoggerTest {
	 public static void main(String[] args) {
	        AppLogger logger1 = AppLogger.getInstance();
	        logger1.writeLog("Application started.");

	        AppLogger logger2 = AppLogger.getInstance();
	        logger2.writeLog("User logged in.");

	        if (logger1 == logger2) {
	            System.out.println("Both logger1 and logger2 refer to the same AppLogger instance.");
	        } else {
	            System.out.println("Different AppLogger instances created.");
	        }
	    }

}
