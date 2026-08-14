public class StringAnagram {
    public static void main(String[] args) {

        String str = "abbc";
        String str1 = "abcb";

        int[] arr = new int[127];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch]++;
        }

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            arr[ch]--;
        }

        boolean isAnagram = true;

        for (int i = 0; i < 127; i++) {
            if (arr[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}