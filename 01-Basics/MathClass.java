import java.lang.Math;

class MathClass {
    public static void main(String[] args) {
        double number = 9.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root of " + number + " is: " + squareRoot);

        double base = 2.0;
        double exponent = 3.0;
        double power = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + power);

        double value = -5.0;
        double absoluteValue = Math.abs(value);
        System.out.println("Absolute value of " + value + " is: " + absoluteValue);

        double angleInDegrees = 30.0;
        double angleInRadians = Math.toRadians(angleInDegrees);
        double sineValue = Math.sin(angleInRadians);
        System.out.println("Sine of " + angleInDegrees + " degrees is: " + sineValue);

    }
}
