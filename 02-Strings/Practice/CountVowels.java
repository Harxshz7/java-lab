package Practice;

public class CountVowels {

    public static void main(String[] args) {

        String str = "javaprogramming";

        String vowels = str.replaceAll("[^aeiouAEIOU]", "");

        final int count = vowels.length();

        System.out.println("Original String: " + str);
        System.out.println("Vowels: " + vowels);
        System.out.println("Number of vowels: " + count);
    }
}