package singletonPattern;

public class AppLogger {
    private static AppLogger loggerInstance = null;

    private AppLogger() {
        System.out.println("Logger initialized.");
    }

    public static AppLogger getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new AppLogger();
        }
        return loggerInstance;
    }

    public void writeLog(String message) {
        System.out.println("Log: " + message);
    }
}
