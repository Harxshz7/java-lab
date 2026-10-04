class MethodParent {
    void describe() {
        System.out.println("This behavior comes from the parent.");
    }
}

public class InheritanceWithMethods extends MethodParent {
    void identify() {
        System.out.println("This behavior belongs to the child.");
    }

    public static void main(String[] args) {
        InheritanceWithMethods example = new InheritanceWithMethods();
        example.describe();
        example.identify();
    }
}
