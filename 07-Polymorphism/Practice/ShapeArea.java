package Practice;

public class ShapeArea {
    public static void main(String[] args) {
        AreaShape[] shapes = {
            new AreaCircle(5),
            new AreaRectangle(4, 6)
        };

        for (AreaShape shape : shapes) {
            System.out.printf("%s area: %.2f%n", shape.getName(), shape.area());
        }
    }
}

abstract class AreaShape {
    public abstract double area();

    public abstract String getName();
}

class AreaCircle extends AreaShape {
    private final double radius;

    AreaCircle(double radius) {
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

class AreaRectangle extends AreaShape {
    private final double length;
    private final double width;

    AreaRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}
