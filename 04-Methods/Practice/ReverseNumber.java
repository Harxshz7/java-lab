package Practice;

public class ReverseNumber {
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println("Reversed number of 1234 is: " + reverseNumber(1234));
        System.out.println("Reversed number of 5678 is: " + reverseNumber(5678));
    }

}