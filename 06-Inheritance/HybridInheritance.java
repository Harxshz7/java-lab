class HybridDevice {
    void powerOn() {
        System.out.println("Device powers on.");
    }
}

class HybridComputer extends HybridDevice {
    void compute() {
        System.out.println("Computer computes.");
    }
}

interface HybridPortable {
    void carry();
}

public class HybridInheritance extends HybridComputer implements HybridPortable {
    @Override
    public void carry() {
        System.out.println("Laptop can be carried.");
    }

    public static void main(String[] args) {
        HybridInheritance laptop = new HybridInheritance();
        laptop.powerOn();
        laptop.compute();
        laptop.carry();
    }
}
