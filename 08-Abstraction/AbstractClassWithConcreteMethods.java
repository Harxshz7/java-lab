public class AbstractClassWithConcreteMethods {
    public static void main(String[] args) {
        Report report = new SalesReport();
        report.generate();
    }
}

abstract class Report {
    public final void generate() {
        prepareData();
        formatOutput();
        System.out.println("Report generated.");
    }

    protected abstract void prepareData();

    protected void formatOutput() {
        System.out.println("Formatting report for presentation.");
    }
}

class SalesReport extends Report {
    @Override
    protected void prepareData() {
        System.out.println("Loading sales data.");
    }
}
