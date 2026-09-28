public class Constructors {
    private final String name;
    private final int age;

    Constructors(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        Constructors person = new Constructors("Neha", 28);
        person.display();
    }
}
