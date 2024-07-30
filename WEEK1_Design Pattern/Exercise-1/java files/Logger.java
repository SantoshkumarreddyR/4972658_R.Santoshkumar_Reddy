public class Logger {
    private static Logger instance;

    // Step 2: Ensure the constructor of Logger is private
    private Logger() {
        // private constructor to prevent instantiation
    }

    // Step 3: Provide a public static method to get the instance of the Logger class
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Additional method for logging
    public void log(String message) {
        System.out.println(message);
    }
}
