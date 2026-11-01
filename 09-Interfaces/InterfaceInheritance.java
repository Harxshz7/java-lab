public class InterfaceInheritance {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        car.start();
        car.charge();
    }
}

interface Vehicle {
    void start();
}

interface ElectricVehicle extends Vehicle {
    void charge();
}

class ElectricCar implements ElectricVehicle {
    @Override
    public void start() {
        System.out.println("Electric car started.");
    }

    @Override
    public void charge() {
        System.out.println("Electric car is charging.");
    }
}
