public class AbstractClass {
    public static void main(String[] args) {
        Document document = new PdfDocument("annual-report.pdf");
        document.open();
        document.print();
    }
}

abstract class Document {
    private final String fileName;

    protected Document(String fileName) {
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("File name must not be blank.");
        }
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public abstract void open();

    public void print() {
        System.out.println("Printing " + fileName + ".");
    }
}

class PdfDocument extends Document {
    PdfDocument(String fileName) {
        super(fileName);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF document: " + getFileName());
    }
}
