package Practice;

public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println(brand + " starts.");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic vehicle");
        vehicle.start();
        Car car = new Car("Toyota");
        car.start();
        car.drive();
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    void drive() {
        System.out.println(brand + " drives safely.");
    }
}
