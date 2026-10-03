package Practice;

public class Product {
    private final int productId;
    private final String name;
    private double price;
    private int stock;

    public Product(int productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public boolean sell(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public void display() {
        System.out.printf("%d - %s - %.2f - stock: %d%n", productId, name, price, stock);
    }

    public static void main(String[] args) {
        Product product = new Product(501, "Keyboard", 49.99, 10);
        product.sell(2);
        product.display();
    }
}
