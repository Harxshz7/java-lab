package Practice;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello World from Java";
        String[] words = str.split(" ");
        String reversedStr = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedStr += words[i] + " ";
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed Words: " + reversedStr.trim());

    }
}
