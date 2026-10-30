public class AbstractionIntroduction {
    public static void main(String[] args) {
        Appliance appliance = new WashingMachine();
        appliance.turnOn();
        appliance.performTask();
        appliance.turnOff();
    }
}

abstract class Appliance {
    public abstract void performTask();

    public void turnOn() {
        System.out.println("Appliance is switched on.");
    }

    public void turnOff() {
        System.out.println("Appliance is switched off.");
    }
}

class WashingMachine extends Appliance {
    @Override
    public void performTask() {
        System.out.println("Washing machine is cleaning clothes.");
    }
}
