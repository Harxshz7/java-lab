package Practice;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum of two integers: " + calculator.add(8, 5));
        System.out.println("Sum of three integers: " + calculator.add(8, 5, 2));
        System.out.println("Sum of decimals: " + calculator.add(2.5, 1.75));
    }

    public int add(int first, int second) {
        return first + second;
    }

    public int add(int first, int second, int third) {
        return first + second + third;
    }

    public double add(double first, double second) {
        return first + second;
    }
}
