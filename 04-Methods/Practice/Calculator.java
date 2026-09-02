package Practice;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        System.out.println("addiction  " + add(10, 20));
        System.out.println("subtraction  " + subtract(10, 20));
        System.out.println("multiplication  " + multiply(10, 20));
        System.out.println("division  " + divide(20, 20));
        System.out.println("modulus  " + mod(10, 20));
    }

}