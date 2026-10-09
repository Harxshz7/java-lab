package Practice;

public class Person {
    protected final String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Person: " + name);
    }

    public static void main(String[] args) {
        Person person = new Person("Arun");
        person.display();
        Employee employee = new Employee(3002, "Tara", 55000);
        employee.display();
    }
}
