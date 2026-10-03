package Practice;

public class Car {
    private final String brand;
    private final String model;
    private boolean running;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void start() {
        running = true;
    }

    public void stop() {
        running = false;
    }

    public void displayStatus() {
        System.out.println(brand + " " + model + " is " + (running ? "running" : "stopped"));
    }

    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic");
        car.start();
        car.displayStatus();
    }
}
