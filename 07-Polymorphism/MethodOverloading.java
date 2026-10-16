public class MethodOverloading {
    public static void main(String[] args) {
        OverloadingPrinter printer = new OverloadingPrinter();

        printer.print(25);
        printer.print("Hello, Java!");
        printer.print(3.14);
    }
}

class OverloadingPrinter {
    public void print(int value) {
        System.out.println("Integer: " + value);
    }

    public void print(String value) {
        System.out.println("Text: " + value);
    }

    public void print(double value) {
        System.out.println("Decimal: " + value);
    }
}
