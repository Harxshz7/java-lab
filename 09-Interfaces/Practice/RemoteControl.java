package Practice;

public class RemoteControl {
    public static void main(String[] args) {
        Device television = new Television();
        television.turnOn();
        television.turnOff();
    }
}

interface Device {
    void turnOn();

    void turnOff();
}

class Television implements Device {
    @Override
    public void turnOn() {
        System.out.println("Television turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Television turned off.");
    }
}
