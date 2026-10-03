package Practice;

public class Student {
    private final int rollNumber;
    private String name;
    private double marks;

    public Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        setMarks(marks);
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    public String getGrade() {
        if (marks >= 90)
            return "A";
        if (marks >= 75)
            return "B";
        if (marks >= 60)
            return "C";
        return "D";
    }

    public void display() {
        System.out.println(rollNumber + " - " + name + " - Grade " + getGrade());
    }

    public static void main(String[] args) {
        Student student = new Student(101, "Anika", 88);
        student.display();
    }
}
