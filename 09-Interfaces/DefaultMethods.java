public class DefaultMethods {
    public static void main(String[] args) {
        Printer printer = new OfficePrinter();
        printer.print("Monthly report");
        printer.showStatus();
    }
}

interface Printer {
    void print(String document);

    default void showStatus() {
        System.out.println("Printer is ready.");
    }
}

class OfficePrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}
