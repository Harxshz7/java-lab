package Practice;

public class Employee extends Person {
    private final int employeeId;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        super(name);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * percentage / 100;
        }
    }

    @Override
    public void display() {
        System.out.printf("%d - %s - %.2f%n", employeeId, name, salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(3001, "Meera", 60000);
        employee.giveRaise(8);
        employee.display();
    }
}
