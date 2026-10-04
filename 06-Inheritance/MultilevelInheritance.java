class MultilevelLivingThing {
    void breathe() {
        System.out.println("Living things breathe.");
    }
}

class MultilevelAnimal extends MultilevelLivingThing {
    void move() {
        System.out.println("Animals move.");
    }
}

public class MultilevelInheritance extends MultilevelAnimal {
    void bark() {
        System.out.println("Dogs bark.");
    }

    public static void main(String[] args) {
        MultilevelInheritance dog = new MultilevelInheritance();
        dog.breathe();
        dog.move();
        dog.bark();
    }
}
