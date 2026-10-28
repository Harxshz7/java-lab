public class Upcasting {
    public static void main(String[] args) {
        UpcastVehicle vehicle = new UpcastCar();
        vehicle.start();
    }
}

class UpcastVehicle {
    public void start() {
        System.out.println("The vehicle starts.");
    }
}

class UpcastCar extends UpcastVehicle {
    @Override
    public void start() {
        System.out.println("The car starts with a key.");
    }

    public void drive() {
        System.out.println("The car is moving.");
    }
}
