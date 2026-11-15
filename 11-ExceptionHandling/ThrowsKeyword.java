import java.io.IOException;

public class ThrowsKeyword {
    private static void readFile() throws IOException {
        throw new IOException("Unable to read the requested file.");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
