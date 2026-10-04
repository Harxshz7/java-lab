class SuperParent {
    protected String message = "Parent field";

    SuperParent() {
        System.out.println("Parent constructor.");
    }

    void display() {
        System.out.println("Parent method.");
    }
}

public class SuperKeyword extends SuperParent {
    private String message = "Child field";

    SuperKeyword() {
        super();
    }

    @Override
    void display() {
        super.display();
        System.out.println(super.message);
        System.out.println(message);
    }

    public static void main(String[] args) {
        new SuperKeyword().display();
    }
}
