class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    void drive() {
        System.out.println(model + " is moving.");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.drive();
    }
}
