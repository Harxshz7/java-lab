public class StringCharacterAccess {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        System.out.println("Original String: " + str);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);
    }

}
