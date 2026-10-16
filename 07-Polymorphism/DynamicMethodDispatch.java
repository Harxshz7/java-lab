public class DynamicMethodDispatch {
    public static void main(String[] args) {
        DispatchShape shape;

        shape = new DispatchCircle();
        shape.draw();

        shape = new DispatchSquare();
        shape.draw();
    }
}

class DispatchShape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

class DispatchCircle extends DispatchShape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class DispatchSquare extends DispatchShape {
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}
