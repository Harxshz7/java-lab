public class TryBlock {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 };

        try {
            System.out.println("Value: " + numbers[1]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("The requested array index does not exist.");
        }
    }
}
