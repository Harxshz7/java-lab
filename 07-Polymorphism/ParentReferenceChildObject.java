public class ParentReferenceChildObject {
    public static void main(String[] args) {
        ReferenceParent reference = new ReferenceChild();

        reference.show();
        reference.parentOnly();
    }
}

class ReferenceParent {
    public void show() {
        System.out.println("Parent implementation.");
    }

    public void parentOnly() {
        System.out.println("This method belongs to the parent.");
    }
}

class ReferenceChild extends ReferenceParent {
    @Override
    public void show() {
        System.out.println("Child implementation.");
    }

    public void childOnly() {
        System.out.println("This method belongs to the child.");
    }
}
