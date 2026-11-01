public class InterfaceImplementation {
    public static void main(String[] args) {
        Light light = new Light();
        light.turnOn();
        light.turnOff();
    }
}

interface Switchable {
    void turnOn();

    void turnOff();
}

class Light implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is off.");
    }
}
