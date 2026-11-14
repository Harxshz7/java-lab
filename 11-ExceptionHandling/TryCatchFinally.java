public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int result = 12 / 0;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("Could not complete the calculation.");
        } finally {
            System.out.println("Calculation attempt finished.");
        }
    }
}
