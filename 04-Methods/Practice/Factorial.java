package Practice;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + factorial(5));
        System.out.println("Factorial of 0 is: " + factorial(0));
        System.out.println("Factorial of 1 is: " + factorial(1));
    }

}