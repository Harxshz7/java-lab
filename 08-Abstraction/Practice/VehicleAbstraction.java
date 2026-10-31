package Practice;

public class VehicleAbstraction {
    public static void main(String[] args) {
        Vehicle vehicle = new ElectricCar("EV-101");
        vehicle.start();
        vehicle.move();
        vehicle.stop();
    }
}

abstract class Vehicle {
    private final String registrationNumber;

    protected Vehicle(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank()) {
            throw new IllegalArgumentException("Registration number must not be blank.");
        }
        this.registrationNumber = registrationNumber;
    }

    protected String getRegistrationNumber() {
        return registrationNumber;
    }

    public void start() {
        System.out.println(registrationNumber + " started.");
    }

    public void stop() {
        System.out.println(registrationNumber + " stopped.");
    }

    public abstract void move();
}

class ElectricCar extends Vehicle {
    ElectricCar(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public void move() {
        System.out.println(getRegistrationNumber() + " is moving silently on battery power.");
    }
}
