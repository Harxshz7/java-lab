public class StringPalindrome {
    public static void main(String[] args) {
        String str = "level";
        char[] charArray = str.toCharArray();
        int i = 0, j = charArray.length - 1;
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        String reversed = new String(charArray);
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

}
