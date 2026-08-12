package Practice;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Remove spaces from this string";
        String strWithoutSpaces = str.replaceAll(" ", "");

        System.out.println("Original String: " + str);
        System.out.println("String without spaces: " + strWithoutSpaces);
    }

}
