import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, Java!");
        System.out.print("Welcome to Java Lab\n");

        String name = "Harsha";
        int age = 20;

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);

        System.out.print("\nEnter your name: ");
        String userName = sc.nextLine();

        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        System.out.print("Enter your first character: ");
        char character = sc.next().charAt(0);

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("\n===== USER DETAILS =====");

        System.out.println("Name       : " + userName);
        System.out.println("Age        : " + userAge);
        System.out.println("Percentage : " + percentage);
        System.out.println("Character  : " + character);
        System.out.println("Student    : " + isStudent);

        sc.close();
    }
}