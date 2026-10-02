public class FinalMembers {
    private final String id;
    private static final double TAX_RATE = 0.18;

    FinalMembers(String id) {
        this.id = id;
    }

    double calculateTax(double amount) {
        return amount * TAX_RATE;
    }

    public static void main(String[] args) {
        FinalMembers invoice = new FinalMembers("INV-101");
        System.out.println(invoice.id + " tax: " + invoice.calculateTax(1000));
    }
}
