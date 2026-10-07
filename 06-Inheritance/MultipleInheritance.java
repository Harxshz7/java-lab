interface MultiplePrintable {
    void print();
}

interface MultipleScannable {
    void scan();
}

public class MultipleInheritance implements MultiplePrintable, MultipleScannable {
    @Override
    public void print() {
        System.out.println("Printing document.");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document.");
    }

    public static void main(String[] args) {
        MultipleInheritance machine = new MultipleInheritance();
        machine.print();
        machine.scan();
    }
}
