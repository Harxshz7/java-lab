public class InterfaceVariables {
    public static void main(String[] args) {
        System.out.println("Maximum attempts: " + Configuration.MAX_ATTEMPTS);
        System.out.println("Application: " + Configuration.APPLICATION_NAME);
    }
}

interface Configuration {
    int MAX_ATTEMPTS = 3;
    String APPLICATION_NAME = "Java Lab";
}
