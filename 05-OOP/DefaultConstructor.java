public class DefaultConstructor {
    private String message;

    DefaultConstructor() {
        message = "Object created by a default constructor.";
    }

    public static void main(String[] args) {
        DefaultConstructor example = new DefaultConstructor();
        System.out.println(example.message);
    }
}
