package Practice;

public class ShapeAbstraction {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(2.5), new Rectangle(3, 4)};

        for (Shape shape : shapes) {
            System.out.printf("%s perimeter: %.2f%n", shape.name(), shape.perimeter());
        }
    }
}

abstract class Shape {
    public abstract double perimeter();

    public abstract String name();
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String name() {
        return "Circle";
    }
}

class Rectangle extends Shape {
    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String name() {
        return "Rectangle";
    }
}
