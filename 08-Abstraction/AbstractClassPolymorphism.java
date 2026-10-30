public class AbstractClassPolymorphism {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(3), new Rectangle(4, 5)};

        for (Shape shape : shapes) {
            System.out.printf("%s area: %.2f%n", shape.getName(), shape.area());
        }
    }
}

abstract class Shape {
    public abstract double area();

    public abstract String getName();
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
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
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
    public double area() {
        return width * height;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}
