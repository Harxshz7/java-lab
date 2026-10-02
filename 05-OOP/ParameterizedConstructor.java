public class ParameterizedConstructor {
    private final String product;
    private final double price;

    ParameterizedConstructor(String product, double price) {
        this.product = product;
        this.price = price;
    }

    void display() {
        System.out.println(product + " costs " + price);
    }

    public static void main(String[] args) {
        ParameterizedConstructor item = new ParameterizedConstructor("Notebook", 4.99);
        item.display();
    }
}
