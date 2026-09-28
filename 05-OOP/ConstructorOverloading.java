public class ConstructorOverloading {
    private final String name;
    private final int quantity;

    ConstructorOverloading() {
        this("Unknown", 0);
    }

    ConstructorOverloading(String name) {
        this(name, 1);
    }

    ConstructorOverloading(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println(name + ": " + quantity);
    }

    public static void main(String[] args) {
        new ConstructorOverloading().display();
        new ConstructorOverloading("Pen").display();
        new ConstructorOverloading("Books", 3).display();
    }
}
