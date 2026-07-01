public class methods {
    static void display() {
        System.out.println("This is a static method");
    }

    void show() {
        System.out.println("This is a non-static method");
    }

    int add(int a, int b) {
        System.out.println(
                "this is a method with parameter and return type which performs addition of two numbers: " + (a + b));
        return a + b;
    }

    public static void main(String[] args) {
        display();
        new methods().show();
        new methods().add(10, 20);

    }
}
