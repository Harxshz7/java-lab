class ConstructorBase {
    ConstructorBase(String name) {
        System.out.println("Base constructor: " + name);
    }
}

public class ConstructorInheritance extends ConstructorBase {
    ConstructorInheritance(String name) {
        super(name);
        System.out.println("Child constructor.");
    }

    public static void main(String[] args) {
        new ConstructorInheritance("Account");
    }
}
