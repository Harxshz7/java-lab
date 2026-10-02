class ReferenceBox {
    int value;
}

public class ObjectReference {
    static void update(ReferenceBox box) {
        box.value = 42;
    }

    public static void main(String[] args) {
        ReferenceBox first = new ReferenceBox();
        ReferenceBox second = first;
        update(first);

        System.out.println("first: " + first.value);
        System.out.println("second: " + second.value);
        System.out.println("Same object: " + (first == second));
    }
}
