public class StringToCharArray {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();

        System.out.println("Character array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }

}
