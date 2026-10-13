package Practice;

public class LargestNumber {
    public static int largest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(largest(5, 10, 3)); // Output: 10
        System.out.println(largest(15, 8, 12)); // Output: 15
        System.out.println(largest(4, 4, 4)); // Output: 4
    }
}
