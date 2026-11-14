public class FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Inside the try block.");
        } catch (RuntimeException exception) {
            System.out.println("An error occurred.");
        } finally {
            System.out.println("The finally block runs whether or not an exception occurs.");
        }
    }
}
