public class VoidMethod {
    void displayMessage() {
        System.out.println("Hello from the void method!");
    }

    public static void main(String[] args) {
        VoidMethod vm = new VoidMethod();
        System.out.println("This is a void method example.");
        vm.displayMessage();
    }

}