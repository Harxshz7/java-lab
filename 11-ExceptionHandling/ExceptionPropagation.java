public class ExceptionPropagation {
    private static void divide() {
        int result = 10 / 0;
        System.out.println(result);
    }

    private static void calculate() {
        divide();
    }

    public static void main(String[] args) {
        try {
            calculate();
        } catch (ArithmeticException exception) {
            System.out.println("Exception propagated to main: " + exception.getMessage());
        }
    }
}
