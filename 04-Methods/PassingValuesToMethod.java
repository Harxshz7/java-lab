public class PassingValuesToMethod {
    void displayMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        PassingValuesToMethod pvtm = new PassingValuesToMethod();
        System.out.println("Passing values to a method example.");
        pvtm.displayMessage("Hello from the method with parameters!");
    }

}