public class MultipleCatchBlocks {
    public static void main(String[] args) {
        String input = args.length > 0 ? args[0] : "10";

        try {
            int number = Integer.parseInt(input);
            System.out.println("Value: " + 100 / number);
        } catch (NumberFormatException exception) {
            System.out.println("Please provide a whole number.");
        } catch (ArithmeticException exception) {
            System.out.println("The number must not be zero.");
        }
    }
}
