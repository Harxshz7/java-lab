public class StaticKeyword {

    static String college = "Tunga Mahavidyalaya";

    static {
        System.out.println("Static block executed");
    }

    // Instance variables
    String name;
    int age;

    StaticKeyword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void showCollege() {
        System.out.println("College: " + college);
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {

        System.out.println("Program Started\n");

        StaticKeyword.showCollege();

        System.out.println();

        StaticKeyword student1 = new StaticKeyword("Harsha", 20);
        StaticKeyword student2 = new StaticKeyword("karina", 26);

        student1.displayStudent();

        System.out.println();

        student2.displayStudent();

        System.out.println("\nChanging static variable...");

        StaticKeyword.college = "ABC College";

        System.out.println();

        student1.displayStudent();

        System.out.println();

        student2.displayStudent();
    }
}