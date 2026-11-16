public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String input = "12x";

        try {
            int number = Integer.parseInt(input);
            System.out.println("Number: " + number);
        } catch (NumberFormatException exception) {
            System.out.println("\"" + input + "\" is not a valid integer.");
        }
    }
}
