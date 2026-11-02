public class InterfaceMethods {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        logger.log("Application started.");
    }
}

interface Logger {
    void log(String message);
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
