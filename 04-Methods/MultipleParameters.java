public class MultipleParameters {

    public void displayMessage(String message, int number) {
        System.out.println(message + " The number is: " + number);
    }

    public static void main(String[] args) {
        MultipleParameters mp = new MultipleParameters();
        System.out.println("Multiple parameters example.");
        mp.displayMessage("Hello from the method with multiple parameters!", 42);
    }
}