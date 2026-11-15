public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = { 10, 0 };

            try {
                System.out.println(numbers[0] / numbers[1]);
            } catch (ArithmeticException exception) {
                System.out.println("The inner block caught division by zero.");
            }

            System.out.println(numbers[2]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("The outer block caught an invalid array index.");
        }
    }
}
