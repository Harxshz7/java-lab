public class MethodOverloading {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading calculator = new MethodOverloading();
        System.out.println("Sum of integers: " + calculator.add(5, 10));
        System.out.println("Sum of doubles: " + calculator.add(5.5, 10.5));
    }

}
