public class DivisionException {
    public static void main(String[] args) {
        int dividend = 25;
        int divisor = 0;

        try {
            System.out.println("Result: " + dividend / divisor);
        } catch (ArithmeticException exception) {
            System.out.println("Division error: divisor cannot be zero.");
        }
    }
}
