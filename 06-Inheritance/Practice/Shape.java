package Practice;

public abstract class Shape {
    public abstract double area();

    public void displayArea() {
        System.out.println("Area: " + area());
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.displayArea();
        Shape rectangle = new Rectangle(4, 6);
        rectangle.displayArea();
    }
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double length;
    private final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
