public class InterfaceDeclaration {
    public static void main(String[] args) {
        Printable printable = new Document();
        printable.print();
    }
}

interface Printable {
    void print();
}

class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing the document.");
    }
}
