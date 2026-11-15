public class UncheckedExceptions {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Handled unchecked exception: " + exception.getMessage());
        }
    }
}
