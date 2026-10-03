package Practice;

public class Employee {
    private final int employeeId;
    private final String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * percentage / 100;
        }
    }

    public void display() {
        System.out.printf("%d - %s - %.2f%n", employeeId, name, salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(2001, "Vikram", 50000);
        employee.giveRaise(10);
        employee.display();
    }
}
