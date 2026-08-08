public class FinalKeyword {

    static final double PI = 3.14159;

    final int age = 20;

    void display() {
        System.out.println("PI: " + PI);
        System.out.println("Age: " + age);

    }

    final void showMessage() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {

        FinalKeyword obj = new FinalKeyword();

        obj.display();
        obj.showMessage();

        System.out.println("PI: " + FinalKeyword.PI);
    }
}