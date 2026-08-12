package Practice;

public class CountWords {
    public static void main(String[] args) {
        String str = "count the number of words in this string";
        String[] words = str.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            count++;
        }
        System.out.println("Original String: " + str);
        System.out.println("Number of words: " + count);
    }

}
