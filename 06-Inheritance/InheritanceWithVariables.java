class VariableParent {
    protected String category = "General";
}

public class InheritanceWithVariables extends VariableParent {
    private String item = "Notebook";

    void display() {
        System.out.println(item + " belongs to " + category + ".");
    }

    public static void main(String[] args) {
        new InheritanceWithVariables().display();
    }
}
