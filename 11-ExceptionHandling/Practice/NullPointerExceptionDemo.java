public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String message = null;

        try {
            System.out.println(message.length());
        } catch (NullPointerException exception) {
            System.out.println("Cannot use a method on a null reference.");
        }
    }
}
