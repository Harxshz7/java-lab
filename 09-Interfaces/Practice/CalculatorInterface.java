package Practice;

public class CalculatorInterface {
    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator();
        System.out.println("Product: " + calculator.multiply(6, 7));
    }
}

interface Calculator {
    int multiply(int first, int second);
}

class BasicCalculator implements Calculator {
    @Override
    public int multiply(int first, int second) {
        return first * second;
    }
}
