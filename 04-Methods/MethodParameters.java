public class MethodParameters {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        MethodParameters mp = new MethodParameters();
        System.out.println("Method parameters example.");
        mp.displayMessage("Hello from the method with parameters!");
    }

}