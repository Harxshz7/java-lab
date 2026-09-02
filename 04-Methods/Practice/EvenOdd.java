package Practice;

public class EvenOdd {
    public static String evenOdd(int a) {
        if (a % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println("the given number is:" + evenOdd(10));
        System.out.println("the given number is:" + evenOdd(11));
    }

}