public class AbstractClassWithVariables {
    public static void main(String[] args) {
        EmployeeRole role = new DeveloperRole("Anika");
        role.describe();
        role.work();
    }
}

abstract class EmployeeRole {
    protected final String employeeName;
    protected final String department = "Technology";

    protected EmployeeRole(String employeeName) {
        if (employeeName == null || employeeName.isBlank()) {
            throw new IllegalArgumentException("Employee name must not be blank.");
        }
        this.employeeName = employeeName;
    }

    public void describe() {
        System.out.println(employeeName + " works in " + department + ".");
    }

    public abstract void work();
}

class DeveloperRole extends EmployeeRole {
    DeveloperRole(String employeeName) {
        super(employeeName);
    }

    @Override
    public void work() {
        System.out.println(employeeName + " develops and reviews software.");
    }
}
