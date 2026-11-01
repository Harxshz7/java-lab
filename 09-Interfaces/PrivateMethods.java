public class PrivateMethods {
    public static void main(String[] args) {
        Report report = new SalesReport();
        report.generate();
    }
}

interface Report {
    default void generate() {
        printHeader();
        System.out.println("Sales data: 125 units sold.");
        printFooter();
    }

    private void printHeader() {
        System.out.println("--- Sales Report ---");
    }

    private void printFooter() {
        System.out.println("--- End of Report ---");
    }
}

class SalesReport implements Report {
}
