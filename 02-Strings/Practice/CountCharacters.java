package Practice;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "Hello World from Java";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Number of characters (excluding spaces): " + count);
    }
}
