package Practice;

public class Book {
    private final String title;
    private final String author;
    private boolean borrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public boolean borrow() {
        if (!borrowed) {
            borrowed = true;
            return true;
        }
        return false;
    }

    public void returnBook() {
        borrowed = false;
    }

    public void display() {
        System.out.println(title + " by " + author + " - " + (borrowed ? "borrowed" : "available"));
    }

    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin");
        book.borrow();
        book.display();
    }
}
