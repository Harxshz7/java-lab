public class ExceptionHandlingMethods {
    public static void main(String[] args) {
        try {
            throw new IllegalStateException("The operation is not allowed in this state.");
        } catch (IllegalStateException exception) {
            System.out.println("getMessage(): " + exception.getMessage());
            System.out.println("toString(): " + exception.toString());
            System.out.println("getClass(): " + exception.getClass().getName());
        }
    }
}
