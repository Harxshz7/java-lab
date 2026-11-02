public class FunctionalInterface {
    public static void main(String[] args) {
        Calculator addition = (first, second) -> first + second;
        System.out.println("Sum: " + addition.calculate(8, 4));
    }
}

@java.lang.FunctionalInterface
interface Calculator {
    int calculate(int first, int second);
}
