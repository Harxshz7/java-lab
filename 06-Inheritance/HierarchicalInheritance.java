class HierarchicalVehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

class HierarchicalCar extends HierarchicalVehicle {
    void drive() {
        System.out.println("Car drives.");
    }
}

class HierarchicalBike extends HierarchicalVehicle {
    void ride() {
        System.out.println("Bike rides.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        HierarchicalCar car = new HierarchicalCar();
        car.start();
        car.drive();

        HierarchicalBike bike = new HierarchicalBike();
        bike.start();
        bike.ride();
    }
}
