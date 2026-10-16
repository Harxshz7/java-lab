public class CompileTimePolymorphism {
    public static void main(String[] args) {
        CompileTimeCalculator calculator = new CompileTimeCalculator();

        System.out.println("Two integers: " + calculator.add(4, 7));
        System.out.println("Three integers: " + calculator.add(4, 7, 9));
        System.out.println("Two decimals: " + calculator.add(2.5, 3.5));
    }
}

class CompileTimeCalculator {
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
