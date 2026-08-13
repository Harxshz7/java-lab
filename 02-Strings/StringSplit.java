public class StringSplit {

    public static void main(String[] args) {
        String str = "Hello, welecome to the world of Java programming!";
        String[] words = str.split(" ");
        System.out.println("Original String: " + str);
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
