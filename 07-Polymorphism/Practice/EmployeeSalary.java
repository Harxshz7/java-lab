package Practice;

public class EmployeeSalary {
    public static void main(String[] args) {
        SalaryEmployee[] employees = {
            new MonthlySalaryEmployee("Asha", 50000),
            new HourlySalaryEmployee("Ravi", 25, 160)
        };

        for (SalaryEmployee employee : employees) {
            System.out.printf("%s earns $%.2f%n", employee.getName(), employee.calculateSalary());
        }
    }
}

abstract class SalaryEmployee {
    private final String name;

    SalaryEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();
}

class MonthlySalaryEmployee extends SalaryEmployee {
    private final double monthlySalary;

    MonthlySalaryEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class HourlySalaryEmployee extends SalaryEmployee {
    private final double hourlyRate;
    private final int hoursWorked;

    HourlySalaryEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
