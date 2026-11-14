public class ExceptionIntroduction {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            System.out.println(numerator / denominator);
        } catch (ArithmeticException exception) {
            System.out.println("An exception occurred: " + exception.getMessage());
        }

        System.out.println("The program continues after handling the exception.");
    }
}
