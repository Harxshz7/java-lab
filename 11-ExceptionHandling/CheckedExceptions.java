import java.io.IOException;

public class CheckedExceptions {
    private static void performOperation() throws IOException {
        throw new IOException("This checked exception must be handled or declared.");
    }

    public static void main(String[] args) {
        try {
            performOperation();
        } catch (IOException exception) {
            System.out.println("Handled IOException: " + exception.getMessage());
        }
    }
}
